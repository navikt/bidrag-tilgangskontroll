package no.nav.bidrag.tilgangskontroll.response;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class AttributeAssignment {

  private String attributeId;
  private String value;
  private String category;
  private String dataType;
}