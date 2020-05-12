# bidrag-tilgangskontroll
Tilgangskontroll for bidrag mikrotjenester


## Deploy

#### Manuell deploy til github packages

bidrag-tilgangskontroll-artifacten kan deployes manuelt til github packages med følgende CURL-kommando (eksempelet viser deploy av versjon 1.3):

JAR
<code>
curl -X PUT \
"https://maven.pkg.github.com/navikt/bidrag-tilgangskontroll/no/nav/bidrag/bidrag-tilgangskontroll/1.2/bidrag-tilgangskontroll-1.3.jar" \
-H "Authorization: token {lim inn PAT her}" \
--upload-file "{full sti til lokalt maven repo}/bidrag-tilgangskontroll-1.3.jar" -vvv
</code>

POM
<code>
	curl -X PUT \
	"https://maven.pkg.github.com/navikt/bidrag-tilgangskontroll/no/nav/bidrag/bidrag-tilgangskontroll/1.3/bidrag-tilgangskontroll-1.3.pom" \
	-H "Authorization: token {lim inn PAT her}" \
	--upload-file "{full sti til lokalt maven repo}/bidrag-tilgangskontroll-1.3.pom" -vvv
</code>
