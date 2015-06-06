
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< a, cis e >1 < c e g > < bis dis'' fis > < gis b dis'' > < ges bes d' > < ais cis'' eis'' > < c ees g > < ges, bes, des > < des' fes aeses > < a, c ees > 
		< ges bes d'' > < e g bes > < d' f a > < cis, e, gis, > < a cis' e' > < eis, gis, b, > < des, fes, aeses, > < f a cis'' > < gis bis disis'' > < d' f a > }
		\addlyrics 
		{ [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] [___] }
}