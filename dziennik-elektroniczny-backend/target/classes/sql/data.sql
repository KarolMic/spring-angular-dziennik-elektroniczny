
INSERT INTO PUBLIC.CLASS(CLASS_ID, NAME, YEAR) VALUES
(1, '1A', 2018),
(2, '2B', 2019),
(3, '3C', 2020);

INSERT INTO PUBLIC.STUDENT(STUDENT_ID, NAME, SURNAME, CLASS_ID) VALUES
(1, 'Karol', 'Przykładowy', 1),
(2, 'Mateusz', 'Kowalski', 2),
(3, 'Patryk', 'Kwiat', 3);

INSERT INTO PUBLIC.TEACHER(TEACHER_ID, NAME, SURNAME) VALUES
(1, 'Agnieszka', 'Jankowska'),
(2, 'Luiza', 'Sawicka'),
(3, 'Hubert', 'Brzeziński');

INSERT INTO PUBLIC.SUBJECT(SUBJECT_ID, NAME) VALUES
(1, 'MATEMATYKA'),
(2, 'JĘZYK POLSKI'),
(3, 'CHEMIA'),
(4, 'FIZYKA'),
(5, 'JĘZYK ANGIELSKI'),
(6, 'HISTORIA'),
(7, 'WIEDZA O SPOŁECZEŃSTWIE'),
(8, 'WYCHOWANIE FIZYCZNE'),
(9, 'INFORMATYKA'),
(10, 'RELIGIA'),
(11, 'MUZYKA'),
(12, 'PLASTYKA'),
(13, 'TECHNIKA');

INSERT INTO PUBLIC.HOURLESSON(HOUR_LESSON_ID, NAME, HOUR) VALUES
(1, 'FIRST_LESSON', '7:30 - 8:15'),
(2, 'SECCOND_LESSON', '8:20 - 9:05'),
(3, 'THIRD_LESSON', '9:15 - 10:00'),
(4, 'FOURTH_LESSON', '10:10 - 10:55'),
(5, 'FIFTH_LESSON', '11:15 - 12:00'),
(6, 'SIXTH_LESSON', '12:10 - 12:55'),
(7, 'SEVENTH_LESSON', '13:05 - 13:50'),
(8, 'EIGHTH_LESSON', '14:10 - 14:55'),
(9, 'NINTH_LESSON', '15:05 - 15:50');

INSERT INTO PUBLIC.DAYOFWEEK(DAY_OF_WEEK_ID, NAME) VALUES
(1, 'Monday'),
(2, 'Tuesday'),
(3, 'Wednesday'),
(4, 'Thursday'),
(5, 'Friday'),
(6, 'Saturday'),
(7, 'Sunday');

INSERT INTO PUBLIC.LESSON(LESSON_ID, SUBJECT_ID, DAY_OF_WEEK_ID, HOUR_LESSON_ID, CLASS_ID, TEACHER_ID) VALUES
-- klasa 1A
(1,   1, 1, 1, 1, 1),
(2,   2, 4, 1, 1, 3),
(3,   3, 5, 1, 1, 2),

(4,   2, 1, 2, 1, 2),
(5,   6, 2, 2, 1, 3),
(6,   3, 4, 2, 1, 1),
(7,   9, 5, 2, 1, 3),

(8,   3, 1, 3, 1, 3),
(9,   7, 2, 3, 1, 1),
(10, 12, 3, 3, 1, 2),
(11,  4, 4, 3, 1, 2),
(12,  6, 5, 3, 1, 1),

(13,  4, 1, 4, 1, 1),
(14,  8, 2, 4, 1, 2),
(15, 12, 3, 4, 1, 3),
(16,  2, 4, 4, 1, 1),
(17,  7, 5, 4, 1, 1),

(18,  5, 1, 5, 1, 2),
(19,  9, 2, 5, 1, 3),
(20, 13, 3, 5, 1, 1),
(21,  1, 5, 5, 1, 1),

(22, 10, 2, 6, 1, 1),
(23,  1, 3, 6, 1, 2),

(24,  8, 3, 7, 1, 1),

(25,  9, 3, 8, 1, 3),

(26, 11, 3, 9, 1, 2),

-- klasa 2B
(27,   6, 1, 2, 2, 1),
(28,   7, 4, 2, 2, 3),
(29,   2, 5, 2, 2, 2),

(30,   9, 1, 1, 2, 2),
(31,   5, 2, 1, 2, 3),
(32,   4, 4, 1, 2, 1),
(33,   1, 5, 1, 2, 3),

(34,   5, 1, 4, 2, 3),
(35,   8, 2, 4, 2, 1),
(36,   7, 3, 4, 2, 2),
(37,   2, 4, 4, 2, 2),
(38,   1, 5, 4, 2, 1),

(39,   8, 1, 3, 2, 1),
(40,   9, 2, 3, 2, 2),
(41,  13, 3, 3, 2, 3),
(42,  12, 4, 3, 2, 1),
(43,  10, 5, 3, 2, 1),

(44,   2, 1, 6, 2, 2),
(45,   3, 2, 6, 2, 3),
(46,  11, 3, 6, 2, 1),
(47,  10, 5, 6, 2, 1),

(48,  12, 2, 5, 2, 1),
(49,   8, 3, 5, 2, 2),

(50,  9, 3, 9, 2, 1),

(51,  3, 3, 8, 2, 3),

(52,  2, 3, 7, 2, 2)
;

-- password encoder: https://www.bcryptcalculator.com/encode
-- password: admin
INSERT INTO PUBLIC.USER(USER_ID, USERNAME, PASSWORD, email, STUDENT_ID, TEACHER_ID) VALUES
(1, 'ajankowska', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'ajankowska@gmail.com', null, 1),
(2, 'lsawicka', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'lsawicka@gmail.com', null, 2),
(3, 'hbrzezinski', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'hbrzezinski@gmail.com', null, 3),
(4, 'kprzykladowy', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'kprzykladowy@gmail.com', 1, null),
(5, 'mkowalski', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'mkowalski@gmail.com', 2, null),
(6, 'pkwiat', '$2a$10$knkMoA.6fjd0AoCp4NIjNeFRhq1ebPiAAO.RUE/e7BMA5eycSRQdK', 'pkwiat@gmail.com', 3, null);
