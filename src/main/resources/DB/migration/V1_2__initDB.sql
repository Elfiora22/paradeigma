CREATE TABLE  interviewer(
id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
phone_number VARCHAR (10),
login VARCHAR (10) UNIQUE,
password VARCHAR (8)
);

CREATE TABLE questionnaire(
id INT NOT NULL PRIMARY KEY,
title VARCHAR(256)
);

CREATE TABLE question(
id INT NOT NULL PRIMARY KEY,
question_text VARCHAR (256),
questionnaire_id INT,
CONSTRAINT questionnaire_fk FOREIGN KEY (questionnaire_id)REFERENCES questionnaire(id)
);

CREATE TABLE survey_session(
id INT NOT NULL UNIQUE  PRIMARY KEY,
date_time TIMESTAMP,
interviewer_id INT,
CONSTRAINT interviewer_id_fk FOREIGN KEY (interviewer_id)REFERENCES interviewer(id),
questionnaire_id INT,
CONSTRAINT questionnaire_id_fk FOREIGN KEY (questionnaire_id)REFERENCES questionnaire(id)
);

CREATE TABLE scope(
id INT NOT NULL PRIMARY KEY,
answer_type VARCHAR (256),
text VARCHAR (256),
question_id INT,
CONSTRAINT question_fk FOREIGN KEY (question_id)REFERENCES question(id)
);

CREATE TABLE answer(
id INT NOT NULL,
answer_text VARCHAR (256),
question_id INT,
scope_id INT,
survey_session_id INT,
CONSTRAINT question_id_fk FOREIGN KEY (question_id)REFERENCES question(id),
CONSTRAINT scope_id_fk FOREIGN KEY (scope_id)REFERENCES scope(id),
CONSTRAINT survey_session_id_fk FOREIGN KEY (survey_session_id)REFERENCES survey_session(id)
);