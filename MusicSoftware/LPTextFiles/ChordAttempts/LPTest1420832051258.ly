
\version "2.18.2"
\header { 
	title = "Bass Clef Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< ees, ges, c >1 < f, bes, des > < des fes beses > < a, cis e > < ais cisis' eis' > < gis b eis' > < fis a cis' > < des geses beses > < des f bes > < dis, fisis, ais, > }
		\addlyrics 
		{ [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] }
}