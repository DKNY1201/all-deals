/**
 * Created by Bi on 11/15/17.
 */

function serializeObject(form) {
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
        jsonObject[this.name] = this.value;
    });
    return jsonObject;
};

function formatDate(date) {
    var d = new Date(date),
        month = '' + (d.getMonth() + 1),
        day = '' + d.getDate(),
        year = d.getFullYear();

    if (month.length < 2) month = '0' + month;
    if (day.length < 2) day = '0' + day;

    return [month, day, year].join('/');
}

$(document).ready(function () {
    const contextRoot = "/" + window.location.pathname.split('/')[1];

    $(".comment-btn").on("click", function () {
        var data = $("#comment-form").serialize();

        const dataToSend = JSON.stringify(serializeObject($('#comment-form')));
        const dealId = $(".deal-id").data("dealid");

        $.ajax({
            type : 'POST',
            url : contextRoot + '/rest/comment/' + dealId,
            dataType : "json",
            data : dataToSend,
            contentType : 'application/json',
            success : function(response) {
                $('.error').hide();
                $("#success").append('<hr>' + formatDate(response.postingTime) + '<br/>' + response.content + '<br/> ');
                $('#success').show();
            },
            error : function(errorObject) {
                if (errorObject.responseJSON.errorType === "CommentValidationError") {
                    const errors = errorObject.responseJSON.errors;
                    $.each(errors, function (i, error) {
                        const errMsg = error.message;

                        if (errMsg.indexOf("Title") !== -1) {
                            $(".title-error-message").append(errMsg);
                        }

                        if (errMsg.indexOf("Content") !== -1) {
                            $(".content-error-message").append(errMsg);
                        }
                    })
                } else {
                    alert(errorObject.responseJSON.errors(0));
                }
            }
        });
    })
})