/**
 * SPDX-License-Identifier: Apache-2.0
 */
package com.devonfw.tools.solicitor;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Solicitor version information.
 */
@Component
@PropertySource({ "classpath:com/devonfw/tools/solicitor/version.properties" })
@ConfigurationProperties(prefix = "solicitor")
public class SolicitorVersion {

    private static final String EXTENSION_ARTIFACT_DEFAULT = "NONE";

    private String artifact;

    private String version;

    private String githash;

    private String builddate;

    private String extensionArtifact;

    private String extensionVersion;

    private String extensionGithash;

    private String extensionBuilddate;

    /**
     * Constructor.
     */
    public SolicitorVersion() {

    }

    /**
     * This method gets the field <tt>artifact</tt>.
     *
     * @return the field artifact
     */
    public String getArtifact() {

        return artifact;
    }

    /**
     * This method gets the field <tt>builddate</tt>.
     *
     * @return the field builddate
     */
    public String getBuilddate() {

        return builddate;
    }

    /**
     * This method gets the field <tt>githash</tt>.
     *
     * @return the field githash
     */
    public String getGithash() {

        return githash;
    }

    /**
     * This method gets the field <tt>version</tt>.
     *
     * @return the field version
     */
    public String getVersion() {

        return version;
    }

    /**
     * This method sets the field <tt>artifact</tt>.
     *
     * @param artifact the new value of the field artifact
     */
    public void setArtifact(String artifact) {

        this.artifact = artifact;
    }

    /**
     * This method sets the field <tt>builddate</tt>.
     *
     * @param builddate the new value of the field builddate
     */
    public void setBuilddate(String builddate) {

        this.builddate = builddate;
    }

    /**
     * This method sets the field <tt>githash</tt>.
     *
     * @param githash the new value of the field githash
     */
    public void setGithash(String githash) {

        this.githash = githash;
    }

    /**
     * This method sets the field <tt>version</tt>.
     *
     * @param version the new value of the field version
     */
    public void setVersion(String version) {

        this.version = version;
    }

    /**
     * This method gets the field <tt>extensionArtifact</tt>.
     *
     * @return the field extensionArtifact
     */
    public String getExtensionArtifact() {

        return extensionArtifact;
    }

    /**
     * This method sets the field <tt>extensionArtifact</tt>.
     *
     * @param extensionArtifact the new value of the field extensionArtifact
     */
    public void setExtensionArtifact(String extensionArtifact) {

        this.extensionArtifact = extensionArtifact;
    }

    /**
     * This method gets the field <tt>extensionVersion</tt>.
     *
     * @return the field extensionVersion
     */
    public String getExtensionVersion() {

        return extensionVersion;
    }

    /**
     * This method sets the field <tt>extensionVersion</tt>.
     *
     * @param extensionVersion the new value of the field extensionVersion
     */
    public void setExtensionVersion(String extensionVersion) {

        this.extensionVersion = extensionVersion;
    }

    /**
     * This method gets the field <tt>extensionGithash</tt>.
     *
     * @return the field extensionGithash
     */
    public String getExtensionGithash() {

        return extensionGithash;
    }

    /**
     * This method sets the field <tt>extensionGithash</tt>.
     *
     * @param extensionGithash the new value of the field extensionGithash
     */
    public void setExtensionGithash(String extensionGithash) {

        this.extensionGithash = extensionGithash;
    }

    /**
     * This method gets the field <tt>extensionBuilddate</tt>.
     *
     * @return the field extensionBuilddate
     */
    public String getExtensionBuilddate() {

        return extensionBuilddate;
    }

    /**
     * This method sets the field <tt>extensionBuilddate</tt>.
     *
     * @param extensionBuilddate the new value of the field extensionBuilddate
     */
    public void setExtensionBuilddate(String extensionBuilddate) {

        this.extensionBuilddate = extensionBuilddate;
    }

    public boolean isExtensionPresent() {

        return !EXTENSION_ARTIFACT_DEFAULT.equals(getExtensionArtifact());
    }
}
