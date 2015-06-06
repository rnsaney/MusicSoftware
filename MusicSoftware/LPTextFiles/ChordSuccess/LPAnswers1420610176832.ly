
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< c' e' gis' >1 < d f a > < e g b > < fis, a, c > < gis, bis, disis > < c ees g > < ces' eeses' geses' > < gis b d' > < bis disis' fisis' > < bes, d f > 
		< b, dis fis > < des, f, a, > < a c' e' > < bes, des fes > < aes, ces ees > < ges, beses, deses > < ces ees g > < g, b, d > < ces' eeses' geses' > < g b d' > }
		\addlyrics 
		{ C+ Dm Em Fs• Gs+ Cm Cb• Gs• BsM BbM BM Db+ Am Bb• Abm Gb• Cb+ GM Cb• GM }
}