
INSERT INTO PUBLIC.CLASS(CLAZZ, NAME, YEAR) VALUES
('1', '1A', 2018),
('2', '2B', 2019),
('3', '3C', 2020);

INSERT INTO PUBLIC.STUDENT(STUDENT_ID, NAME, SURNAME, CLAZZ) VALUES
('1', 'Karol', 'Przykładowy', '1'),
('2', 'Mateusz', 'Kowalski', '2'),
('3', 'Patryk', 'Kwiat', '3');

INSERT INTO PUBLIC.TEACHER(TEACHER_ID, NAME, SURNAME) VALUES
('1', 'Agnieszka', 'Jankowska'),
('2', 'Luiza', 'Sawicka'),
('3', 'Hubert', 'Brzeziński');

INSERT INTO PUBLIC.SUBJECT(SUBJECT_ID, NAME) VALUES
('1', 'MATEMATYKA'),
('2', 'JĘZYK POLSKI'),
('3', 'CHEMIA'),
('4', 'FIZYKA'),
('5', 'JĘZYK ANGIELSKI'),
('6', 'HISTORIA'),
('7', 'WIEDZA O SPOŁECZEŃSTWIE'),
('8', 'WYCHOWANIE FIZYCZNE'),
('9', 'INFORMATYKA'),
('10', 'RELIGIA'),
('11', 'MUZYKA'),
('12', 'PLASTYKA'),
('13', 'TECHNIKA');

INSERT INTO PUBLIC.HOURLESSON(HOUR_LESSON_ID, NAME, HOUR) VALUES
('1', 'FIRST_LESSON', '7:30'),
('2', 'SECCOND_LESSON', '8:20'),
('3', 'THIRD_LESSON', '9:15'),
('4', 'FOURTH_LESSON', '10:10'),
('5', 'FIFTH_LESSON', '11:15'),
('6', 'SIXTH_LESSON', '12:10'),
('7', 'SEVENTH_LESSON', '13:05'),
('8', 'EIGHTH_LESSON', '14:10'),
('9', 'NINTH_LESSON', '15:05');

INSERT INTO PUBLIC.DAYOFWEEK(DAYOFWEEKID, NAME) VALUES
('1', 'Monday'),
('2', 'Tuesday'),
('3', 'Wednesday'),
('4', 'Thursday'),
('5', 'Friday'),
('6', 'Saturday'),
('7', 'Sunday');

INSERT INTO PUBLIC.LESSON(LESSON_ID, SUBJECT_ID, DAYOFWEEKID, HOUR_LESSON_ID, CLAZZ, TEACHER_ID) VALUES
('1', '1', '1', '1', '1', '1'),
('2', '2', '2', '2', '1', '2');
