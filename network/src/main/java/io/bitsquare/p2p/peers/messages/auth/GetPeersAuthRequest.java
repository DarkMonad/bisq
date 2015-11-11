package io.bitsquare.p2p.peers.messages.auth;

import io.bitsquare.app.Version;
import io.bitsquare.p2p.Address;

import java.util.HashSet;

public final class GetPeersAuthRequest extends AuthenticationMessage {
    // That object is sent over the wire, so we need to take care of version compatibility.
    private static final long serialVersionUID = Version.NETWORK_PROTOCOL_VERSION;

    public final Address address;
    public final long responderNonce;
    public final HashSet<Address> peerAddresses;

    public GetPeersAuthRequest(Address address, long responderNonce, HashSet<Address> peerAddresses) {
        this.address = address;
        this.responderNonce = responderNonce;
        this.peerAddresses = peerAddresses;
    }

    @Override
    public String toString() {
        return "GetPeersAuthRequest{" +
                "address=" + address +
                ", challengerNonce=" + responderNonce +
                ", peerAddresses=" + peerAddresses +
                "} " + super.toString();
    }
}