package com.janwarlen.feature;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.*;
import java.security.spec.EdECPoint;
import java.security.spec.EdECPublicKeySpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.NamedParameterSpec;
import java.util.Arrays;
import java.util.Base64;

public class EdDSA {

    public void func() throws InvalidKeyException, NoSuchAlgorithmException, SignatureException, InvalidKeySpecException {
        // example: generate a key pair and sign
        KeyPairGenerator kpg = KeyPairGenerator.getInstance("Ed25519");
        KeyPair kp = kpg.generateKeyPair();
// algorithm is pure Ed25519
        Signature sig = Signature.getInstance("Ed25519");
        sig.initSign(kp.getPrivate());
        sig.update("msg".getBytes(StandardCharsets.UTF_8));
        byte[] s = sig.sign();

// example: use KeyFactory to contruct a public key
        KeyFactory kf = KeyFactory.getInstance("EdDSA");
        boolean xOdd = true;
        BigInteger y = new BigInteger("111111111111");
        NamedParameterSpec paramSpec = new NamedParameterSpec("Ed25519");
        EdECPublicKeySpec pubSpec = new EdECPublicKeySpec(paramSpec, new EdECPoint(xOdd, y));
        PublicKey pubKey = kf.generatePublic(pubSpec);
    }
}
