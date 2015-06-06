
\version "2.18.2"
\header { 
	title = "Bass Clef Root-Position Chord Test"
 composer = "RNS"
}
\score{
	\new Staff {
		\clef bass

		< ais, cisis eisis >1 < gis bis disis' > < ais cisis' eis' > < des, f, aes, > < d, f, a, > < a cis' eis' > < ees,, ges,, bes,, > < des f aes > < g bes d' > < aes, c ees > 
		< dis,, fisis,, ais,, > < fes, aes, ces > < eis gisis bis > < ces, ees, g, > < bis,, disis, fisis, > < c ees g > < ees, ges, bes, > < ces eeses geses > < ges bes d' > < gis bis disis' > }
		\addlyrics 
		{ AshAUG GshAUG AshMAJ DbMAJ DMIN AAUG EbMIN DbMAJ GMIN AbMAJ DshMAJ FbMAJ EshMAJ CbAUG BshMAJ CMIN EbMIN CbDIM GbAUG GshAUG }
}