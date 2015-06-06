
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< c' ees' g >1 < bes d' f > < fis ais cisis' > < aes ces'' ees'' > < a c'' e'' > < a, c e > < fis, a, cis > < ges beses des' > < cis, eis, gisis, > < ees ges beses > 
		< a cis' e' > < ais, cis eis > < fes aeses ces'' > < fis, a, cis > < aes ces'' eeses'' > < des, f, aes, > < bes des' f > < a c'' ees'' > < gis, bis, dis > < c' ees' ges > }
		\addlyrics 
		{ [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] }
}