
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< fis ais cisis' >1 < e gis bis > < ais cisis' eis' > < e gis bis > < b d' fis' > < bis disis' fisis' > < dis, fis, a, > < des, fes, aes, > < ges beses des' > < b, dis fisis > 
		< c' e' g' > < e, gis, bis, > < d, fis, a, > < a, cis e > < c ees ges > < gis bis disis' > < ees ges bes > < ais cis' eis' > < fis, a, cis > < des, fes, aeses, > }
		\addlyrics 
		{ Fsh+ E+ AshM E+ Bm BshM Dsh˚ Dbm Gbm B+ CM E+ DM AM C˚ Gsh+ Ebm Ashm Fshm Db˚ }
}