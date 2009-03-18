USE [datawarehouse]
GO
/****** Objeto:  Table [dbo].[dimTiempo]    Fecha de la secuencia de comandos: 12/06/2008 02:02:57 ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[dimTiempo](
	[MesID] [int] NOT NULL,
	[mes] [int] NOT NULL,
	[anio] [int] NOT NULL,
 CONSTRAINT [PK_dimTiempo] PRIMARY KEY CLUSTERED 
(
	[MesID] ASC
)WITH (IGNORE_DUP_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
