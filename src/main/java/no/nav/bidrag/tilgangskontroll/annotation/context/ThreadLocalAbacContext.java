package no.nav.bidrag.tilgangskontroll.annotation.context;

import no.nav.bidrag.tilgangskontroll.request.XacmlRequest;

public class ThreadLocalAbacContext implements AbacContext {

  private final ThreadLocal<XacmlRequest> threadLocalRequest = new ThreadLocal<XacmlRequest>() {
    @Override
    protected XacmlRequest initialValue() {
      return new XacmlRequest();
    }
  };

  @Override
  public XacmlRequest getRequest() {
    return threadLocalRequest.get();
  }

  @Override
  public void cleanUp() {
    threadLocalRequest.remove();
  }
}