/**
@file archivo.cpp
@brief Implementacion de [archivo].h
@author Erik Giron (C#200313492)

Copyright (C) 2006 Erik Giron

http://www.itforcegt.org/200313492

This program is free software; you can redistribute it and/or
modify it under the terms of the GNU General Public License
as published by the Free Software Foundation; either
version 2 of the License, or (at your option) any later
version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
*/
#include "ericleinserttitulo.h"
#include <qlineedit.h>
EricleInsertTitulo::EricleInsertTitulo(QWidget *parent, const char *name)
    :insertTitulo(parent, name)
{
}
/*
void EricleInsertTitulo::reject(){
    this->close();
}
*/
registro* EricleInsertTitulo::getRegistro()
{
    return &r;
}

void EricleInsertTitulo::accept()
{
    r.tipo = T_TITULO;
    if(fieldId->text().toInt(NULL,10) > 0){
        r.dato.rTitulo.id = fieldId->text().toInt(NULL,10);        
        strcpy(r.dato.rTitulo.nombre,fieldNombre->text().ascii());
        strcpy(r.dato.rTitulo.fecha,fieldFecha->text().ascii());
        strcpy(r.dato.rTitulo.path_imagen, fieldPathImagen->text().ascii());     
        
        close();
	emit added() ;
    }
}


