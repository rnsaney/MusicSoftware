
\version "2.18.2"
\header { 
	title = "Test"
 composer = "RNS"
}


high = \relative c'' {aeses1
 eeses \glissando eeses, \glissando fis,, \glissando d, \glissando des,, \glissando disis, \glissando fis, \glissando ees,, \glissando fes, \glissando e,
 fisis, \glissando eeses,, \glissando ges, \glissando des,, \glissando 
}

middle = {fes1
 ces \glissando bes, \glissando c, \glissando b, \glissando bes,, \glissando bis, \glissando dis \glissando ces, \glissando ces \glissando b,
 disis \glissando ces, \glissando des \glissando aeses,, \glissando 
}

low = {ces'1
 ges \glissando ges \glissando a, \glissando gis \glissando f, \glissando gis \glissando a \glissando aes, \glissando aes \glissando gis
 ais \glissando aes, \glissando bes \glissando fes, \glissando 
}

<<
	\new Staff{
		\clef treble
		
		\high
	}
	\new Staff{
		\clef alto
		\relative c''
		\middle
	}
	\new Staff{
		\clef bass
		\relative c
		\low
	}
>>