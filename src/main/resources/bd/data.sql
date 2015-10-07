/* DATOOOS */

INSERT INTO pyr_usuario(usuanomb,usuapass,usuaid,usuahabi,usuac2dm)
VALUES ('mkyong','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y',1,true,'');
INSERT INTO pyr_usuario(usuanomb,usuapass,usuaid,usuahabi,usuac2dm)
VALUES ('alex','$2a$10$04TVADrR6/SPLBjsK0N30.Jf5fNjBugSACeGv1S69dZALR7lSov0y',2, true,'');


INSERT INTO pyr_usuarole(usroid,usrousua,usrorole)
VALUES (1,1,'ROLE_ADMIN');
INSERT INTO pyr_usuarole(usroid,usrousua,usrorole)
VALUES (2,2,'ROLE_USER');
