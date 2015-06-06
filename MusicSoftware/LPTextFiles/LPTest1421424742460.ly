
\version "2.18.2"
\header { 
	title = "Test"
 composer = "RNS"
}
high = {g1
 f \glissando aeses \glissando eeses \glissando f \glissando a \glissando ees \glissando dis \glissando e \glissando cis \glissando a
 bes \glissando aes \glissando c \glissando e \glissando 
}

middle = {e1
 cis \glissando fes \glissando ces \glissando des \glissando f \glissando bes \glissando b \glissando cis \glissando g \glissando f
 g \glissando ees \glissando g \glissando b \glissando 
}

low = {cis1
 a \glissando ces \glissando ges \glissando a \glissando des \glissando g \glissando fis \glissando ais \glissando e \glissando d
 ees \glissando c \glissando e \glissando gis \glissando 
}

<<
	\new Staff{
		\clef treble
		\relative c''
		\high
	}
	\new Staff{
		\clef alto
		\relative c'
		\middle
	}
	\new Staff{
		\clef bass
		\relative c
		\low
	}
>>