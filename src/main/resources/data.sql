DROP TABLE wrestlers;

CREATE TABLE wrestlers (
    id INT8 NOT NULL,
    name VARCHAR(255),
    wrestling_organisation_type VARCHAR(255),
    image VARCHAR(255),
    PRIMARY KEY (id)
);

INSERT INTO wrestlers(id, name, wrestling_organisation_type, image)
VALUES (1, 'Ric Flair', 'WCW', 'https://www.wwe.com/f/styles/wwe_large/public/rd-talent/Bio/Ric_Flair_bio.jpg'),
       (2, 'Undertaker', 'WWE', 'https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcQEf5lVG8OznLn-UMGBSeh196nqv-xsNwZPbZhmI-0D4w6TvZ91&usqp=CAU'),
       (3, 'Hulk Hogan', 'WWE', 'https://cdn3.whatculture.com/images/2018/09/74b15438c525028b-600x400.jpg'),
       (4, 'Chris Jericho', 'AEW', 'https://cdn1.sixthman.net/2021/jericho/images/artists/4577.jpg');
