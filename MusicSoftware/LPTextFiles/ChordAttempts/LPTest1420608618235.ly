
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< des f a >1 < f, a, cis > < d' f' aes' > < g, bes, d > < cis eis gisis > < ges, bes, d > < ges bes' d'' > < e g bes > < bes des'' fes'' > < des, f, aes, > 
		< c, e, gis, > < bis disis'' gis'' > < des' f' a' > < c e g > < des' fes' aes' > < fes aeses ceses' > < des f a > < d, fis, ais, > < fis, ais, cis > < ees g bes > }
		\addlyrics 
		{ [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] }
}