
package org.onvif.ver20.media.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.onvif.ver20.media.wsdl package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Capabilities_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "Capabilities");
    private final static QName _ConfigurationEnumeration_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "ConfigurationEnumeration");
    private final static QName _GetVideoEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurations");
    private final static QName _GetVideoSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurations");
    private final static QName _GetAudioEncoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurations");
    private final static QName _GetAudioSourceConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurations");
    private final static QName _GetAnalyticsConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAnalyticsConfigurations");
    private final static QName _GetMetadataConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurations");
    private final static QName _GetAudioOutputConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurations");
    private final static QName _GetAudioDecoderConfigurations_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurations");
    private final static QName _GetVideoSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoSourceConfigurationOptions");
    private final static QName _GetVideoEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetVideoEncoderConfigurationOptions");
    private final static QName _GetAudioSourceConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioSourceConfigurationOptions");
    private final static QName _GetAudioEncoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioEncoderConfigurationOptions");
    private final static QName _GetMetadataConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetMetadataConfigurationOptions");
    private final static QName _GetAudioOutputConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioOutputConfigurationOptions");
    private final static QName _GetAudioDecoderConfigurationOptions_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "GetAudioDecoderConfigurationOptions");
    private final static QName _StartMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StartMulticastStreaming");
    private final static QName _StopMulticastStreaming_QNAME = new QName("http://www.onvif.org/ver20/media/wsdl", "StopMulticastStreaming");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.onvif.ver20.media.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetServiceCapabilities }
     * 
     */
    public GetServiceCapabilities createGetServiceCapabilities() {
        return new GetServiceCapabilities();
    }

    /**
     * Create an instance of {@link GetServiceCapabilitiesResponse2 }
     * 
     */
    public GetServiceCapabilitiesResponse2 createGetServiceCapabilitiesResponse2() {
        return new GetServiceCapabilitiesResponse2();
    }

    /**
     * Create an instance of {@link Capabilities2 }
     * 
     */
    public Capabilities2 createCapabilities2() {
        return new Capabilities2();
    }

    /**
     * Create an instance of {@link CreateProfile }
     * 
     */
    public CreateProfile createCreateProfile() {
        return new CreateProfile();
    }

    /**
     * Create an instance of {@link ConfigurationRef }
     * 
     */
    public ConfigurationRef createConfigurationRef() {
        return new ConfigurationRef();
    }

    /**
     * Create an instance of {@link CreateProfileResponse }
     * 
     */
    public CreateProfileResponse createCreateProfileResponse() {
        return new CreateProfileResponse();
    }

    /**
     * Create an instance of {@link GetProfiles }
     * 
     */
    public GetProfiles createGetProfiles() {
        return new GetProfiles();
    }

    /**
     * Create an instance of {@link GetProfilesResponse }
     * 
     */
    public GetProfilesResponse createGetProfilesResponse() {
        return new GetProfilesResponse();
    }

    /**
     * Create an instance of {@link MediaProfile }
     * 
     */
    public MediaProfile createMediaProfile() {
        return new MediaProfile();
    }

    /**
     * Create an instance of {@link AddConfiguration }
     * 
     */
    public AddConfiguration createAddConfiguration() {
        return new AddConfiguration();
    }

    /**
     * Create an instance of {@link AddConfigurationResponse }
     * 
     */
    public AddConfigurationResponse createAddConfigurationResponse() {
        return new AddConfigurationResponse();
    }

    /**
     * Create an instance of {@link RemoveConfiguration }
     * 
     */
    public RemoveConfiguration createRemoveConfiguration() {
        return new RemoveConfiguration();
    }

    /**
     * Create an instance of {@link RemoveConfigurationResponse }
     * 
     */
    public RemoveConfigurationResponse createRemoveConfigurationResponse() {
        return new RemoveConfigurationResponse();
    }

    /**
     * Create an instance of {@link DeleteProfile }
     * 
     */
    public DeleteProfile createDeleteProfile() {
        return new DeleteProfile();
    }

    /**
     * Create an instance of {@link DeleteProfileResponse }
     * 
     */
    public DeleteProfileResponse createDeleteProfileResponse() {
        return new DeleteProfileResponse();
    }

    /**
     * Create an instance of {@link GetConfiguration }
     * 
     */
    public GetConfiguration createGetConfiguration() {
        return new GetConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoEncoderConfigurationsResponse }
     * 
     */
    public GetVideoEncoderConfigurationsResponse createGetVideoEncoderConfigurationsResponse() {
        return new GetVideoEncoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationsResponse }
     * 
     */
    public GetVideoSourceConfigurationsResponse createGetVideoSourceConfigurationsResponse() {
        return new GetVideoSourceConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioEncoderConfigurationsResponse }
     * 
     */
    public GetAudioEncoderConfigurationsResponse createGetAudioEncoderConfigurationsResponse() {
        return new GetAudioEncoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationsResponse }
     * 
     */
    public GetAudioSourceConfigurationsResponse createGetAudioSourceConfigurationsResponse() {
        return new GetAudioSourceConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAnalyticsConfigurationsResponse }
     * 
     */
    public GetAnalyticsConfigurationsResponse createGetAnalyticsConfigurationsResponse() {
        return new GetAnalyticsConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetMetadataConfigurationsResponse }
     * 
     */
    public GetMetadataConfigurationsResponse createGetMetadataConfigurationsResponse() {
        return new GetMetadataConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationsResponse }
     * 
     */
    public GetAudioOutputConfigurationsResponse createGetAudioOutputConfigurationsResponse() {
        return new GetAudioOutputConfigurationsResponse();
    }

    /**
     * Create an instance of {@link GetAudioDecoderConfigurationsResponse }
     * 
     */
    public GetAudioDecoderConfigurationsResponse createGetAudioDecoderConfigurationsResponse() {
        return new GetAudioDecoderConfigurationsResponse();
    }

    /**
     * Create an instance of {@link SetVideoEncoderConfiguration }
     * 
     */
    public SetVideoEncoderConfiguration createSetVideoEncoderConfiguration() {
        return new SetVideoEncoderConfiguration();
    }

    /**
     * Create an instance of {@link SetConfigurationResponse }
     * 
     */
    public SetConfigurationResponse createSetConfigurationResponse() {
        return new SetConfigurationResponse();
    }

    /**
     * Create an instance of {@link SetVideoSourceConfiguration }
     * 
     */
    public SetVideoSourceConfiguration createSetVideoSourceConfiguration() {
        return new SetVideoSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioEncoderConfiguration }
     * 
     */
    public SetAudioEncoderConfiguration createSetAudioEncoderConfiguration() {
        return new SetAudioEncoderConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioSourceConfiguration }
     * 
     */
    public SetAudioSourceConfiguration createSetAudioSourceConfiguration() {
        return new SetAudioSourceConfiguration();
    }

    /**
     * Create an instance of {@link SetMetadataConfiguration }
     * 
     */
    public SetMetadataConfiguration createSetMetadataConfiguration() {
        return new SetMetadataConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioOutputConfiguration }
     * 
     */
    public SetAudioOutputConfiguration createSetAudioOutputConfiguration() {
        return new SetAudioOutputConfiguration();
    }

    /**
     * Create an instance of {@link SetAudioDecoderConfiguration }
     * 
     */
    public SetAudioDecoderConfiguration createSetAudioDecoderConfiguration() {
        return new SetAudioDecoderConfiguration();
    }

    /**
     * Create an instance of {@link GetVideoSourceConfigurationOptionsResponse }
     * 
     */
    public GetVideoSourceConfigurationOptionsResponse createGetVideoSourceConfigurationOptionsResponse() {
        return new GetVideoSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetVideoEncoderConfigurationOptionsResponse }
     * 
     */
    public GetVideoEncoderConfigurationOptionsResponse createGetVideoEncoderConfigurationOptionsResponse() {
        return new GetVideoEncoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioSourceConfigurationOptionsResponse }
     * 
     */
    public GetAudioSourceConfigurationOptionsResponse createGetAudioSourceConfigurationOptionsResponse() {
        return new GetAudioSourceConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioEncoderConfigurationOptionsResponse }
     * 
     */
    public GetAudioEncoderConfigurationOptionsResponse createGetAudioEncoderConfigurationOptionsResponse() {
        return new GetAudioEncoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetMetadataConfigurationOptionsResponse }
     * 
     */
    public GetMetadataConfigurationOptionsResponse createGetMetadataConfigurationOptionsResponse() {
        return new GetMetadataConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioOutputConfigurationOptionsResponse }
     * 
     */
    public GetAudioOutputConfigurationOptionsResponse createGetAudioOutputConfigurationOptionsResponse() {
        return new GetAudioOutputConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetAudioDecoderConfigurationOptionsResponse }
     * 
     */
    public GetAudioDecoderConfigurationOptionsResponse createGetAudioDecoderConfigurationOptionsResponse() {
        return new GetAudioDecoderConfigurationOptionsResponse();
    }

    /**
     * Create an instance of {@link GetStreamUri }
     * 
     */
    public GetStreamUri createGetStreamUri() {
        return new GetStreamUri();
    }

    /**
     * Create an instance of {@link GetStreamUriResponse }
     * 
     */
    public GetStreamUriResponse createGetStreamUriResponse() {
        return new GetStreamUriResponse();
    }

    /**
     * Create an instance of {@link SetSynchronizationPoint }
     * 
     */
    public SetSynchronizationPoint createSetSynchronizationPoint() {
        return new SetSynchronizationPoint();
    }

    /**
     * Create an instance of {@link SetSynchronizationPointResponse }
     * 
     */
    public SetSynchronizationPointResponse createSetSynchronizationPointResponse() {
        return new SetSynchronizationPointResponse();
    }

    /**
     * Create an instance of {@link GetSnapshotUri }
     * 
     */
    public GetSnapshotUri createGetSnapshotUri() {
        return new GetSnapshotUri();
    }

    /**
     * Create an instance of {@link GetSnapshotUriResponse }
     * 
     */
    public GetSnapshotUriResponse createGetSnapshotUriResponse() {
        return new GetSnapshotUriResponse();
    }

    /**
     * Create an instance of {@link StartStopMulticastStreaming }
     * 
     */
    public StartStopMulticastStreaming createStartStopMulticastStreaming() {
        return new StartStopMulticastStreaming();
    }

    /**
     * Create an instance of {@link StartStopMulticastStreamingResponse }
     * 
     */
    public StartStopMulticastStreamingResponse createStartStopMulticastStreamingResponse() {
        return new StartStopMulticastStreamingResponse();
    }

    /**
     * Create an instance of {@link GetVideoSourceModes }
     * 
     */
    public GetVideoSourceModes createGetVideoSourceModes() {
        return new GetVideoSourceModes();
    }

    /**
     * Create an instance of {@link GetVideoSourceModesResponse }
     * 
     */
    public GetVideoSourceModesResponse createGetVideoSourceModesResponse() {
        return new GetVideoSourceModesResponse();
    }

    /**
     * Create an instance of {@link VideoSourceMode }
     * 
     */
    public VideoSourceMode createVideoSourceMode() {
        return new VideoSourceMode();
    }

    /**
     * Create an instance of {@link SetVideoSourceMode }
     * 
     */
    public SetVideoSourceMode createSetVideoSourceMode() {
        return new SetVideoSourceMode();
    }

    /**
     * Create an instance of {@link SetVideoSourceModeResponse }
     * 
     */
    public SetVideoSourceModeResponse createSetVideoSourceModeResponse() {
        return new SetVideoSourceModeResponse();
    }

    /**
     * Create an instance of {@link GetOSDs }
     * 
     */
    public GetOSDs createGetOSDs() {
        return new GetOSDs();
    }

    /**
     * Create an instance of {@link GetOSDsResponse }
     * 
     */
    public GetOSDsResponse createGetOSDsResponse() {
        return new GetOSDsResponse();
    }

    /**
     * Create an instance of {@link SetOSD }
     * 
     */
    public SetOSD createSetOSD() {
        return new SetOSD();
    }

    /**
     * Create an instance of {@link GetOSDOptions }
     * 
     */
    public GetOSDOptions createGetOSDOptions() {
        return new GetOSDOptions();
    }

    /**
     * Create an instance of {@link GetOSDOptionsResponse }
     * 
     */
    public GetOSDOptionsResponse createGetOSDOptionsResponse() {
        return new GetOSDOptionsResponse();
    }

    /**
     * Create an instance of {@link CreateOSD }
     * 
     */
    public CreateOSD createCreateOSD() {
        return new CreateOSD();
    }

    /**
     * Create an instance of {@link CreateOSDResponse }
     * 
     */
    public CreateOSDResponse createCreateOSDResponse() {
        return new CreateOSDResponse();
    }

    /**
     * Create an instance of {@link DeleteOSD }
     * 
     */
    public DeleteOSD createDeleteOSD() {
        return new DeleteOSD();
    }

    /**
     * Create an instance of {@link ProfileCapabilities }
     * 
     */
    public ProfileCapabilities createProfileCapabilities() {
        return new ProfileCapabilities();
    }

    /**
     * Create an instance of {@link StreamingCapabilities }
     * 
     */
    public StreamingCapabilities createStreamingCapabilities() {
        return new StreamingCapabilities();
    }

    /**
     * Create an instance of {@link ConfigurationSet }
     * 
     */
    public ConfigurationSet createConfigurationSet() {
        return new ConfigurationSet();
    }

    /**
     * Create an instance of {@link VideoSourceModeExtension }
     * 
     */
    public VideoSourceModeExtension createVideoSourceModeExtension() {
        return new VideoSourceModeExtension();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Capabilities2 }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "Capabilities")
    public JAXBElement<Capabilities2> createCapabilities(Capabilities2 value) {
        return new JAXBElement<Capabilities2>(_Capabilities_QNAME, Capabilities2 .class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfigurationEnumeration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "ConfigurationEnumeration")
    public JAXBElement<ConfigurationEnumeration> createConfigurationEnumeration(ConfigurationEnumeration value) {
        return new JAXBElement<ConfigurationEnumeration>(_ConfigurationEnumeration_QNAME, ConfigurationEnumeration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetVideoEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetVideoSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioEncoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioSourceConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAnalyticsConfigurations")
    public JAXBElement<GetConfiguration> createGetAnalyticsConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAnalyticsConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurations")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetMetadataConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioOutputConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurations")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurations(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioDecoderConfigurations_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoSourceConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetVideoSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetVideoEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetVideoEncoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetVideoEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioSourceConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioSourceConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioSourceConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioEncoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioEncoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioEncoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetMetadataConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetMetadataConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetMetadataConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioOutputConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioOutputConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioOutputConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetConfiguration }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "GetAudioDecoderConfigurationOptions")
    public JAXBElement<GetConfiguration> createGetAudioDecoderConfigurationOptions(GetConfiguration value) {
        return new JAXBElement<GetConfiguration>(_GetAudioDecoderConfigurationOptions_QNAME, GetConfiguration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StartMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStartMulticastStreaming(StartStopMulticastStreaming value) {
        return new JAXBElement<StartStopMulticastStreaming>(_StartMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StartStopMulticastStreaming }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.onvif.org/ver20/media/wsdl", name = "StopMulticastStreaming")
    public JAXBElement<StartStopMulticastStreaming> createStopMulticastStreaming(StartStopMulticastStreaming value) {
        return new JAXBElement<StartStopMulticastStreaming>(_StopMulticastStreaming_QNAME, StartStopMulticastStreaming.class, null, value);
    }

}
