package no.difi.oxalis.as4.util;

import javax.xml.namespace.QName;

public class Constants {

    public static final String PARTY_ID_TYPE = "urn:fdc:peppol.eu:2017:identifiers:ap";
    public static final String FROM_ROLE = "http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/initiator";
    public static final String TO_ROLE = "http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/responder";
    public static final String SERVICE_TYPE = "urn:fdc:peppol.eu:2017:identifiers:proc-id";

    public static final String EBMS_NAMESPACE = "http://docs.oasis-open.org/ebxml-msg/ebms/v3.0/ns/core/200704/";

    public static final QName MESSAGING_QNAME = new QName(EBMS_NAMESPACE, "Messaging", "eb");
    public static final QName USER_MESSAGE_QNAME = new QName(EBMS_NAMESPACE, "UserMessage");
}