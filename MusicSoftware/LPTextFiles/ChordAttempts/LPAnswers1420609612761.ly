
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< f,, a,, cis, >1 < d, fis, ais, > < dis, fis, ais, > < ges, beses, deses > < fis, a, cis > < ges,, beses,, deses, > < e, gis, b, > < aes, c e > < bis,, dis, fisis, > < ais,, cisis, eis, > 
		< g, bes, d > < a, cis eis > < bis,, dis, fis, > < ces, ees, g, > < ees,, ges,, beses,, > < gis, b, d > < ees,, g,, b,, > < dis,, fis,, a,, > < gis,, b,, d, > < d,, f,, a,, > }
		\addlyrics 
		{ FAUG DAUG DshMIN GbDIM FshMIN GbDIM EMAJ AbAUG BshMIN AshMAJ GMIN AAUG BshDIM CbAUG EbDIM GshDIM EbAUG DshDIM GshDIM DMIN }
}