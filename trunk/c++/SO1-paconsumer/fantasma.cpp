/****************************************************************************
** Form implementation generated from reading ui file 'fantasma.ui'
**
** Created: Sun Nov 11 12:04:52 2007
**      by: The User Interface Compiler ($Id: qt/main.cpp   3.3.7   edited Aug 31 2005 $)
**
** WARNING! All changes made in this file will be lost!
****************************************************************************/

#include "fantasma.h"

#include <qvariant.h>
#include <qlabel.h>
#include <qlayout.h>
#include <qtooltip.h>
#include <qwhatsthis.h>
#include <qimage.h>
#include <qpixmap.h>

static const unsigned char image0_data[] = { 
    0x89, 0x50, 0x4e, 0x47, 0x0d, 0x0a, 0x1a, 0x0a, 0x00, 0x00, 0x00, 0x0d,
    0x49, 0x48, 0x44, 0x52, 0x00, 0x00, 0x00, 0x20, 0x00, 0x00, 0x00, 0x1e,
    0x08, 0x06, 0x00, 0x00, 0x00, 0x4d, 0x0a, 0x1c, 0x29, 0x00, 0x00, 0x00,
    0xff, 0x49, 0x44, 0x41, 0x54, 0x48, 0x89, 0xed, 0x96, 0x31, 0x0e, 0xc2,
    0x30, 0x0c, 0x45, 0x5d, 0xc4, 0xd0, 0x23, 0x30, 0xf6, 0x28, 0x3e, 0x06,
    0x63, 0x8e, 0xd2, 0xa3, 0x64, 0xec, 0x31, 0x7c, 0x14, 0xc6, 0x1e, 0xa1,
    0x1b, 0x0c, 0xf5, 0xaf, 0x88, 0x85, 0x49, 0x10, 0x48, 0xce, 0xc0, 0x5f,
    0xbe, 0x1c, 0x7d, 0xa9, 0xf1, 0xab, 0xdb, 0x64, 0x20, 0xa2, 0x3b, 0x05,
    0xea, 0x14, 0xf9, 0x70, 0x22, 0xa2, 0x73, 0x2d, 0x90, 0xd4, 0x79, 0x54,
    0xaf, 0xe4, 0x05, 0xbe, 0xed, 0x9e, 0x2b, 0xf9, 0x70, 0x02, 0x03, 0x39,
    0x33, 0x90, 0xbd, 0x8e, 0xe7, 0xb1, 0xac, 0x6d, 0x40, 0x90, 0xdb, 0x8a,
    0x32, 0x6d, 0xaf, 0x37, 0xd0, 0x1f, 0x01, 0xb7, 0x73, 0x2b, 0x4b, 0xc2,
    0xcd, 0xbd, 0x27, 0x11, 0x4e, 0xe0, 0xf8, 0x0a, 0x92, 0x3a, 0xab, 0x4b,
    0x5e, 0xf6, 0x9a, 0xf9, 0x39, 0x4f, 0x22, 0xb2, 0xaf, 0xa7, 0x6b, 0xb9,
    0xee, 0xe5, 0xa7, 0x32, 0x8f, 0xe7, 0x64, 0xf5, 0x70, 0x02, 0xc7, 0x0c,
    0xd8, 0x77, 0x8f, 0x8e, 0x20, 0xdb, 0x19, 0x4d, 0x97, 0xa2, 0x6c, 0xcd,
    0x8b, 0x96, 0x98, 0x85, 0x7e, 0x09, 0x4c, 0x66, 0x5a, 0x6f, 0xeb, 0x5a,
    0x2e, 0x18, 0x02, 0xad, 0x79, 0xd1, 0xb2, 0x1b, 0x02, 0xff, 0x0d, 0xb8,
    0xa7, 0x61, 0x5e, 0x2a, 0xff, 0x81, 0x2f, 0xf3, 0x50, 0xbf, 0x04, 0x48,
    0xff, 0x5c, 0xb3, 0x99, 0x6e, 0xf6, 0x8e, 0x00, 0x27, 0x5f, 0x3b, 0x32,
    0xfa, 0x25, 0xc0, 0xf0, 0xc6, 0x43, 0xcf, 0xcd, 0x03, 0x81, 0x45, 0xa3,
    0x0a, 0x27, 0xf0, 0xdf, 0x40, 0xf5, 0x56, 0x0c, 0x89, 0x3a, 0x7f, 0x9a,
    0x73, 0xde, 0x3d, 0xd4, 0x3f, 0x01, 0x81, 0xa3, 0x11, 0xe7, 0xce, 0xd8,
    0x9a, 0xb3, 0x0a, 0x27, 0xe0, 0xde, 0x8a, 0x21, 0xef, 0x3e, 0xff, 0xab,
    0x5c, 0x38, 0x81, 0x07, 0xf6, 0x53, 0x57, 0xd7, 0x01, 0xeb, 0xb6, 0x1e,
    0x00, 0x00, 0x00, 0x00, 0x49, 0x45, 0x4e, 0x44, 0xae, 0x42, 0x60, 0x82
};


/*
 *  Constructs a Fantasma as a child of 'parent', with the
 *  name 'name' and widget flags set to 'f'.
 */
Fantasma::Fantasma( QWidget* parent, const char* name, WFlags fl )
    : QWidget( parent, name, fl )
{
    QImage img;
    img.loadFromData( image0_data, sizeof( image0_data ), "PNG" );
    image0 = img;
    if ( !name )
	setName( "Fantasma" );
    setSizePolicy( QSizePolicy( (QSizePolicy::SizeType)0, (QSizePolicy::SizeType)0, 32, 32, sizePolicy().hasHeightForWidth() ) );
    setMaximumSize( QSize( 32, 32 ) );

    lblFantasma = new QLabel( this, "lblFantasma" );
    lblFantasma->setGeometry( QRect( 0, 0, 32, 32 ) );
    lblFantasma->setPixmap( image0 );
    lblFantasma->setScaledContents( TRUE );
    languageChange();
    resize( QSize(32, 32).expandedTo(minimumSizeHint()) );
    clearWState( WState_Polished );
}

/*
 *  Destroys the object and frees any allocated resources
 */
Fantasma::~Fantasma()
{
    // no need to delete child widgets, Qt does it all for us
}

/*
 *  Sets the strings of the subwidgets using the current
 *  language.
 */
void Fantasma::languageChange()
{
    setCaption( tr( "Fantasma" ) );
}
