package com.niulbird.domain.monitor;

import java.security.cert.X509Certificate;

import org.junit.Assert;
import org.junit.Test;

import com.niulbird.domain.monitor.certificate.CertificateMonitor;

public class CertificateMonitorTest extends BaseTestCase { 
	
	@Test
	public void queryOrg() {
		String name = "getbonuscode.com";
		CertificateMonitor certificateMonitor = new CertificateMonitor();
		X509Certificate certificate = certificateMonitor.query(name);
		Assert.assertNotNull(certificate.getNotAfter());
	}
}