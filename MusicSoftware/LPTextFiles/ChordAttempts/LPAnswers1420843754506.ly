
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< gis b eis' >1 < a, c ees > < aes, c fes > < cis fis a > < d, fis, bes, > < bes, ees ges > < bis dis' gis' > < bis dis' gis' > < eis ais cis' > < ces' eeses' geses' > }
		\addlyrics 
		{
			Es˚ A˚ Fb+ Fsm Bb+ EbM GsM GsM Asm Cb˚
}}