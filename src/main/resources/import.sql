INSERT INTO CATEGORY(ID, NAME) VALUES (1, 'Fantasy');
INSERT INTO CATEGORY(ID, NAME) VALUES (2, 'Science Fiction');
INSERT INTO CATEGORY(ID, NAME) VALUES (3, 'Programming');
 
 
INSERT INTO AUTHOR(ID, NAME) VALUES (1, 'John Ronald Reuel Tolkien');
INSERT INTO AUTHOR(ID, NAME) VALUES (2, 'Douglas Adams');
INSERT INTO AUTHOR(ID, NAME) VALUES (3, 'Eric Freeman, Bert Bates');
INSERT INTO AUTHOR(ID, NAME) VALUES (4, 'Martin Fowler');
INSERT INTO AUTHOR(ID, NAME) VALUES (5, 'Steve Holzner');
INSERT INTO AUTHOR(ID, NAME) VALUES (6, 'Christopher L. Bennett');
 
 
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (1, 'Lord of the rings: The Fellowship of the Ring', 1, 1, '0547928211');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (2, 'Lord of the rings: The Two Towers', 1, 1, '0547928203');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (3, 'Lord of the rings: The Return of the King', 1, 1, '054792819X');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (4, 'The Hitchhiker''s Guide to the Galaxy', 2, 2, '0345391802');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (5, 'The Restaurant at the End of the Universe', 2, 2, '0345391810');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (6, 'Head First Design patterns', 3, 3, '0596007124');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (7, 'Patterns of Enterprise Application Architecture', 4, 3, '0321127420');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (8, 'Design Patterns for Dummies', 5, 3, '0471798541');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (9, 'Star Trek Enterprise: A Choise of Futures', 6, 2, '1476706743');
INSERT INTO BOOK(ID, NAME, ID_AUTHOR, ID_CATEGORY, AMAZON_ID) VALUES (10, 'Star Trek Enterprise: Tower of Babel', 6, 2, '1476749647');