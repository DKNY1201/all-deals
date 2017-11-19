INSERT INTO `role` VALUES (1, 'ADMIN');
INSERT INTO `role` VALUES (2, 'USER');

INSERT INTO `deal_cat` VALUES (1, 'Tech & Electronic', 'Tech & Electronic');
INSERT INTO `deal_cat` VALUES (2, 'Clothing & Accessories', 'Clothing & Accessories');
INSERT INTO `deal_cat` VALUES (3, 'Computers', 'Computers');
INSERT INTO `deal_cat` VALUES (4, 'Health & Beauty', 'Health & Beauty');
INSERT INTO `deal_cat` VALUES (5, 'Children', 'Children');
INSERT INTO `deal_cat` VALUES (6, 'Other', 'Other');

INSERT INTO `store` VALUES (1, 'Walmart', 'Walmart');
INSERT INTO `store` VALUES (2, 'Amazon', 'Amazon');
INSERT INTO `store` VALUES (3, 'Ebay', 'Ebay');
INSERT INTO `store` VALUES (4, 'Target', 'Target');
INSERT INTO `store` VALUES (5, 'BestBuy', 'BestBuy');
INSERT INTO `store` VALUES (6, 'Other', 'Other');

INSERT INTO `deal` (`deal_id`, `dealTitle`, `dealUrl`, `description`, `isFeature`, `isFrontPage`, `postDate`, `price`, `deal_cat_id`, `store_id`, `user_id`)
VALUES
  (2, '64GB Samsung Galaxy S8 Smartphone (Sprint Verizon Carriers)',
      'https://www.bestbuy.com/site/samsung-store/samsung-galaxy-cell-phones/pcmcat1509459420433.c?ref=8575135&loc=af552e60ccb611e7914a3a4e4378d8700INT&acampID=af552e60ccb611e7914a3a4e4378d8700INT&id=pcmcat1509459420433',
      'Best Buy.com has select Samsung Galaxy Note8, S8 or S8+ Smartphone on sale listed below when you \"Buy & Activate w/ a 24-Monthly Installment Plan\" valid for Verizon or Sprint Carriers. Shipping is free, otherwise, select free in-store pickup as an alternative option. Thanks waterfront\r\n\r\nNote, availability for in-store pickup may vary depending on location.\r\n\r\nAvailable Options\r\n\r\n    64GB Samsung Galaxy S8 (various colors)\r\n        Verizon: $15.41/month for 24-Months ~ $369.84\r\n        Sprint: $16.67/month for 24-Months ~ $400.08\r\n\r\n    64GB Samsung Galaxy S8+ (various colors)\r\n        Verizon: $19.41/month for 24-Months ~ $465.84\r\n        Sprint: $20.83/month for 24-Months ~ $499.92\r\n\r\n    64GB Samsung Galaxy Note8 (various colors)\r\n        Verizon: $24.41/month for 24-Months ~ $585.84\r\n        Sprint: $25.41/month for 24-Months ~ $609.84\r\n\r\n',
      b'1', b'1', '2017-11-18 17:21:15', 150.00, 1, 3, 2);

INSERT INTO `deal` (`deal_id`, `dealTitle`, `dealUrl`, `description`, `isFeature`, `isFrontPage`, `postDate`, `price`, `deal_cat_id`, `store_id`, `user_id`)
VALUES
  (3, '64GB Samsung Galaxy S8 Smartphone (Sprint Verizon Carriers)',
      'https://www.bestbuy.com/site/samsung-store/samsung-galaxy-cell-phones/pcmcat1509459420433.c?ref=8575135&loc=af552e60ccb611e7914a3a4e4378d8700INT&acampID=af552e60ccb611e7914a3a4e4378d8700INT&id=pcmcat1509459420433',
      'Best Buy.com has select Samsung Galaxy Note8, S8 or S8+ Smartphone on sale listed below when you \"Buy & Activate w/ a 24-Monthly Installment Plan\" valid for Verizon or Sprint Carriers. Shipping is free, otherwise, select free in-store pickup as an alternative option. Thanks waterfront\r\n\r\nNote, availability for in-store pickup may vary depending on location.\r\n\r\nAvailable Options\r\n\r\n    64GB Samsung Galaxy S8 (various colors)\r\n        Verizon: $15.41/month for 24-Months ~ $369.84\r\n        Sprint: $16.67/month for 24-Months ~ $400.08\r\n\r\n    64GB Samsung Galaxy S8+ (various colors)\r\n        Verizon: $19.41/month for 24-Months ~ $465.84\r\n        Sprint: $20.83/month for 24-Months ~ $499.92\r\n\r\n    64GB Samsung Galaxy Note8 (various colors)\r\n        Verizon: $24.41/month for 24-Months ~ $585.84\r\n        Sprint: $25.41/month for 24-Months ~ $609.84\r\n\r\n',
      b'1', b'1', '2017-11-18 17:21:15', 150.00, 1, 3, 2);