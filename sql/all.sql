/*
-- Query: SELECT * FROM stocks_db.prices
LIMIT 0, 1000

-- Date: 2022-06-20 16:59
*/
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (1,'2022-06-20 16:55:11.000000',100,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (2,'2022-06-20 16:56:07.000000',101.02,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (3,'2022-06-20 16:55:14.000000',70,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (4,'2022-06-20 16:55:18.000000',72,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (5,'2022-06-20 16:55:22.000000',70.5,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (6,'2022-06-20 16:56:07.000000',70.75,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (7,'2022-06-20 16:55:31.000000',70.90,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (8,'2022-06-20 16:55:26.000000',71.05,1,2);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (9,'2022-06-20 16:55:36.000000',100.51,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (10,'2022-06-20 16:56:07.000000',100.75,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (11,'2022-06-20 16:55:45.000000',107,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (12,'2022-06-20 16:55:50.000000',110,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (13,'2022-06-20 16:55:40.000000',111,1,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (14,'2022-06-20 16:58:19.000000',1000,2,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (15,'2022-06-20 16:58:19.000000',1001,2,1);
INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (16,'2022-06-20 16:58:19.000000',1400,2,3);

-- tickers
INSERT INTO  tickers(ticker_id,added_date,ticker_name,ticker_desc) VALUES (1,'2022-06-20 01:20:50.729000','TRCS_LK','TradeCard Inc. USA');
INSERT INTO  tickers(ticker_id,added_date,ticker_name,ticker_desc) VALUES (2,'2022-06-20 01:19:50.625000','IBM_UN','IBM inc. USA');
INSERT INTO  tickers(ticker_id,added_date,ticker_name,ticker_desc) VALUES (3,'2022-06-20 01:20:35.804000','DFCC_SL','DFCC_BANK. SL');

-- sources
INSERT INTO sources (source_id, added_date, source_name, source_desc) VALUES (1,'2022-06-20 01:19:06.104000','SRC01','Source LK');
INSERT INTO sources (source_id, added_date, source_name, source_desc) VALUES (2,'2022-06-20 01:19:11.626000','SRC02','Source CSE');


-- Run the following query to check whether new prices creations are reflected in the table 
-- Here its for source -> SRC01 and ticker -> 

--INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (17,'2022-06-20 16:55:11.000000',302.00,1,1);
--INSERT INTO prices (price_id,added_date,price,source_id,ticker_id) VALUES (18,'2022-06-20 16:56:07.000000',301.02,1,1);