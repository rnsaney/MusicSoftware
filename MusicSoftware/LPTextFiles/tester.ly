
\version "2.18.2"
\header { 
	title = "Tester"
 composer = "RNS"
}

high = {a1 \glissando c \glissando d \bar "|."}

middle = {c1 \glissando g \glissando f \bar "|."}

low = {f1 \glissando e \glissando d \bar "|."}

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
		\low
	}
>>