
/* Drop Indexes */

DROP INDEX IF EXISTS pyr_usuarole_usrousua_usuarole_key;



/* Drop Tables */

DROP TABLE IF EXISTS inv_cliente;
DROP TABLE IF EXISTS pyr_pregunta;
DROP TABLE IF EXISTS public.pyr_pkid;
DROP TABLE IF EXISTS public.pyr_usuarole;
DROP TABLE IF EXISTS public.pyr_usuario;




/* Create Tables */

CREATE TABLE inv_cliente
(
	clieid numeric NOT NULL,
	clienit varchar,
	-- 
	-- 
	clienomb varchar,
	cliedire varchar,
	-- ciudad del cliente
	clieciud numeric,
	-- actividad comercial
	clieacti numeric,
	cliefecr date,
	PRIMARY KEY (clieid)
) WITHOUT OIDS;


CREATE TABLE pyr_pregunta
(
	-- Id de la pregunta hecha por el usuario
	-- 
	pregid int NOT NULL,
	-- Texto con la pregunta
	pregtext varchar,
	pregusua int NOT NULL,
	PRIMARY KEY (pregid)
) WITHOUT OIDS;


CREATE TABLE public.pyr_pkid
(
	pkidcons serial NOT NULL,
	pkidnomb varchar(50),
	pkidvalu int,
	CONSTRAINT pyr_pkid_pkey PRIMARY KEY (pkidcons)
) WITHOUT OIDS;


CREATE TABLE public.pyr_usuario
(
	usuaid int NOT NULL,
	usuanomb varchar(50),
	usuapass varchar(100),
	usuahabi boolean,
	-- Codigo de registro en google.
	usuac2dm varchar,
	CONSTRAINT pyr_usuario_pkey PRIMARY KEY (usuaid)
) WITHOUT OIDS;


CREATE TABLE public.pyr_usuarole
(
	usroid int NOT NULL,
	usrousua int,
	usrorole varchar(50),
	CONSTRAINT pyr_usuarole_pkey PRIMARY KEY (usroid)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE pyr_pregunta
	ADD FOREIGN KEY (pregusua)
	REFERENCES public.pyr_usuario (usuaid)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE public.pyr_usuarole
	ADD CONSTRAINT pyr_usuarole_usrousua_fkey FOREIGN KEY (usrousua)
	REFERENCES public.pyr_usuario (usuaid)
	ON UPDATE NO ACTION
	ON DELETE NO ACTION
;



/* Create Indexes */

CREATE UNIQUE INDEX pyr_usuarole_usrousua_usuarole_key ON public.pyr_usuarole USING BTREE (usrousua, usrorole);



/* Comments */

COMMENT ON COLUMN inv_cliente.clienomb IS '
';
COMMENT ON COLUMN inv_cliente.clieciud IS 'ciudad del cliente';
COMMENT ON COLUMN inv_cliente.clieacti IS 'actividad comercial';
COMMENT ON COLUMN pyr_pregunta.pregid IS 'Id de la pregunta hecha por el usuario
';
COMMENT ON COLUMN pyr_pregunta.pregtext IS 'Texto con la pregunta';
COMMENT ON COLUMN public.pyr_usuario.usuac2dm IS 'Codigo de registro en google.';



