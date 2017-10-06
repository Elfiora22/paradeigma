CREATE TABLE  interviewer(
id int not null,
phone_number VARCHAR (10),
login VARCHAR (10),
password VARCHAR (8),
PRIMARY KEY (id)
);
CREATE TABLE questionnaire(
id INT  NOT NULL,
title VARCHAR (256),
PRIMARY KEY (id)
);
CREATE TABLE question(
id INT NOT NULL,
question_text VARCHAR (256),
qiestionnaire_id INT,
CONSTRAINT questionnaire_fk FOREIGN KEY (qiestionnaire_id)REFERENCES questionnaire(id)
);
CREATE TABLE survey_session(
id INT  NOT NULL,
date_time TIMESTAMP,
interviewer_id INT,
questionnaire_id INT,
CONSTRAINT interviewer_fk FOREIGN KEY (interviewer_id)REFERENCES interviewer(id),
CONSTRAINT questionnaire_fk FOREIGN KEY (questionnaire_id)REFERENCES questionnaire(id)
);
CREATE TABLE scope(
id INT NOT NULL,
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
CONSTRAINT question_fk FOREIGN KEY (question_id)REFERENCES question(id),
CONSTRAINT scope_fk FOREIGN KEY (scope_id)REFERENCES scope(id),
CONSTRAINT survey_sesssion_fk FOREIGN KEY (survey_session_id)REFERENCES survey_session(id)
);