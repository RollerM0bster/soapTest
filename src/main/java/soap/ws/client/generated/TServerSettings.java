
package soap.ws.client.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TServerSettings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TServerSettings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Accounts_MinimumPasswordLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DB_DatabaseServerType" type="{http://tempuri.org/}TServerType"/&gt;
 *         &lt;element name="DB_FirebirdServerDatabase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdServerPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="DB_FirebirdServerServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdServerSYSDBAPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdServerSYSDBAUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdCharacterSet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdEmbeddedDatabase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_FirebirdEmbeddedCharacterSet" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DB_DemoDatabase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SubnetInheritance_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SubnetInheritance_Fields" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="Edit_MaximumMissingSubnets" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Edit_LockRecords" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Email_From" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_PasswordRequestBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_PasswordRequestSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_SMTPPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_SMTPServer" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_SMTPPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Email_SMTPUsername" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_SMTPRequiresAuthentication" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Email_SMTPRequiresSSL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Email_QueuePurgeDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Email_QueueCheckInterval" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Email_UsernameRequestBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_UsernameRequestSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_PasswordResetBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_PasswordResetSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_NewUserBody" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_NewUserSubject" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Email_ServerRetryMinutes" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Logs_Directory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Logs_DirectoryPerDay" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Logs_FileLogLevel" type="{http://tempuri.org/}TLogLevel"/&gt;
 *         &lt;element name="Logs_ControllerLogLevel" type="{http://tempuri.org/}TLogLevel"/&gt;
 *         &lt;element name="Logs_DebugIgnoreMethods" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="Logs_LogRawBinPacketData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Logs_LogRawSOAPPacketData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Security_SSLCertificateFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Security_SSLKeyFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Security_SSLPassPhrase" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Security_SSLRootCertificateFile" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Security_SSLVerificationDepth" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Security_UseSSL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Server_CompressData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Server_InactivityTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_SessionTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_EncryptData" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Server_SendEncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Server_ReceiveEncryptionKey" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Server_EncryptionType" type="{http://tempuri.org/}TEncryptionType"/&gt;
 *         &lt;element name="Server_EncryptionPassword" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Server_Port" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_SSLPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_RemoteEventFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_ClientRequestTimeout" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_MaxQueue" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_PoolThreads" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_MaxThreads" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Server_ReservedLicencesCustom" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VirtualFiles_AllowAdminsToDeleteNonEmptyDirectories" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VirtualFiles_AllowUsersToDeleteNonEmptyDirectories" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VirtualFiles_CompressFiles" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="VirtualFiles_DefaultUserDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="VirtualFiles_MaximumVirtualFileSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="VirtualFiles_CacheVirtualFilesOnClients" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Search_MaxResults" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Search_MinTokenLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Search_MaxTokenLength" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="BasicSearch_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FTS_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="FTS_FieldDelimiters" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FTS_StopPhrases" type="{http://tempuri.org/}TStringArray"/&gt;
 *         &lt;element name="FTS_UpdateTimestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FTS_IndexingEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Reports_AvailableObjects" type="{http://tempuri.org/}TReportObjects"/&gt;
 *         &lt;element name="PingLogging_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PingLogging_EnableForAllUsers" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PingLogging_UserIds" type="{http://tempuri.org/}TInt64Array"/&gt;
 *         &lt;element name="Backup_FrequencyType" type="{http://tempuri.org/}TScheduleEventFrequencyType"/&gt;
 *         &lt;element name="Backup_Time" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Backup_Directory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Backup_TestRestore" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_PurgeBackups" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_PurgeDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Backup_RestoreDirectory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Backup_PageSize" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Backup_PurgeChangeLogs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_PurgeChangeLogsDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Backup_PurgePingLogs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_PurgePingLogsDays" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Backup_RecalculateDatabaseSelectivity" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_EmailResults" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="Backup_EmailRecipients" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Backup_EmailIncludeLog" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChangeLogging_LogStructuralChanges" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChangeLogging_DetailedChangeLogs" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChangeLogging_LogFieldRevisions" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ChangeLogging_LogFieldRevisionsWhenImporting" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="UserFiles_Directory" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ClientUpdates_AllowLaterClientsToUpgrade" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="ClientUpdates_UpgradeType" type="{http://tempuri.org/}TClientUpgradeType"/&gt;
 *         &lt;element name="UserRestrictions_MinAdminLevelCreateAN" type="{http://tempuri.org/}TUserType"/&gt;
 *         &lt;element name="DiscoveryBots_QueueCheckFrequency" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SOAPServer_Enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_Port" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SOAPServer_SSLPort" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="SOAPServer_WriteMultiRefArray" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_WriteMultiRefObject" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_SendUntyped" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_StrictStructureFieldOrder" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_EncodedXML" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_ClientIDInWSDL" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_Document" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_ExternalTypesAsReferences" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_SOAP12" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="SOAPServer_SOAPMode" type="{http://tempuri.org/}TSOAPMode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TServerSettings", propOrder = {
    "accountsMinimumPasswordLength",
    "dbDatabaseServerType",
    "dbFirebirdServerDatabase",
    "dbFirebirdServerPort",
    "dbFirebirdServerServer",
    "dbFirebirdServerSYSDBAPassword",
    "dbFirebirdServerSYSDBAUsername",
    "dbFirebirdCharacterSet",
    "dbFirebirdEmbeddedDatabase",
    "dbFirebirdEmbeddedCharacterSet",
    "dbDemoDatabase",
    "subnetInheritanceEnabled",
    "subnetInheritanceFields",
    "editMaximumMissingSubnets",
    "editLockRecords",
    "emailFrom",
    "emailPasswordRequestBody",
    "emailPasswordRequestSubject",
    "emailSMTPPassword",
    "emailSMTPServer",
    "emailSMTPPort",
    "emailSMTPUsername",
    "emailSMTPRequiresAuthentication",
    "emailSMTPRequiresSSL",
    "emailQueuePurgeDays",
    "emailQueueCheckInterval",
    "emailUsernameRequestBody",
    "emailUsernameRequestSubject",
    "emailPasswordResetBody",
    "emailPasswordResetSubject",
    "emailNewUserBody",
    "emailNewUserSubject",
    "emailServerRetryMinutes",
    "logsDirectory",
    "logsDirectoryPerDay",
    "logsFileLogLevel",
    "logsControllerLogLevel",
    "logsDebugIgnoreMethods",
    "logsLogRawBinPacketData",
    "logsLogRawSOAPPacketData",
    "securitySSLCertificateFile",
    "securitySSLKeyFile",
    "securitySSLPassPhrase",
    "securitySSLRootCertificateFile",
    "securitySSLVerificationDepth",
    "securityUseSSL",
    "serverCompressData",
    "serverInactivityTimeout",
    "serverSessionTimeout",
    "serverEncryptData",
    "serverSendEncryptionKey",
    "serverReceiveEncryptionKey",
    "serverEncryptionType",
    "serverEncryptionPassword",
    "serverPort",
    "serverSSLPort",
    "serverRemoteEventFrequency",
    "serverClientRequestTimeout",
    "serverMaxQueue",
    "serverPoolThreads",
    "serverMaxThreads",
    "serverReservedLicencesCustom",
    "virtualFilesAllowAdminsToDeleteNonEmptyDirectories",
    "virtualFilesAllowUsersToDeleteNonEmptyDirectories",
    "virtualFilesCompressFiles",
    "virtualFilesDefaultUserDirectory",
    "virtualFilesMaximumVirtualFileSize",
    "virtualFilesCacheVirtualFilesOnClients",
    "searchMaxResults",
    "searchMinTokenLength",
    "searchMaxTokenLength",
    "basicSearchEnabled",
    "ftsEnabled",
    "ftsFieldDelimiters",
    "ftsStopPhrases",
    "ftsUpdateTimestamp",
    "ftsIndexingEnabled",
    "reportsAvailableObjects",
    "pingLoggingEnabled",
    "pingLoggingEnableForAllUsers",
    "pingLoggingUserIds",
    "backupFrequencyType",
    "backupTime",
    "backupDirectory",
    "backupTestRestore",
    "backupPurgeBackups",
    "backupPurgeDays",
    "backupRestoreDirectory",
    "backupPageSize",
    "backupPurgeChangeLogs",
    "backupPurgeChangeLogsDays",
    "backupPurgePingLogs",
    "backupPurgePingLogsDays",
    "backupRecalculateDatabaseSelectivity",
    "backupEmailResults",
    "backupEmailRecipients",
    "backupEmailIncludeLog",
    "changeLoggingLogStructuralChanges",
    "changeLoggingDetailedChangeLogs",
    "changeLoggingLogFieldRevisions",
    "changeLoggingLogFieldRevisionsWhenImporting",
    "userFilesDirectory",
    "clientUpdatesAllowLaterClientsToUpgrade",
    "clientUpdatesUpgradeType",
    "userRestrictionsMinAdminLevelCreateAN",
    "discoveryBotsQueueCheckFrequency",
    "soapServerEnabled",
    "soapServerPort",
    "soapServerSSLPort",
    "soapServerWriteMultiRefArray",
    "soapServerWriteMultiRefObject",
    "soapServerSendUntyped",
    "soapServerStrictStructureFieldOrder",
    "soapServerEncodedXML",
    "soapServerClientIDInWSDL",
    "soapServerDocument",
    "soapServerExternalTypesAsReferences",
    "soapServerSOAP12",
    "soapServerSOAPMode"
})
public class TServerSettings {

    @XmlElement(name = "Accounts_MinimumPasswordLength")
    protected int accountsMinimumPasswordLength;
    @XmlElement(name = "DB_DatabaseServerType", required = true)
    @XmlSchemaType(name = "string")
    protected TServerType dbDatabaseServerType;
    @XmlElement(name = "DB_FirebirdServerDatabase", required = true)
    protected String dbFirebirdServerDatabase;
    @XmlElement(name = "DB_FirebirdServerPort")
    protected int dbFirebirdServerPort;
    @XmlElement(name = "DB_FirebirdServerServer", required = true)
    protected String dbFirebirdServerServer;
    @XmlElement(name = "DB_FirebirdServerSYSDBAPassword", required = true)
    protected String dbFirebirdServerSYSDBAPassword;
    @XmlElement(name = "DB_FirebirdServerSYSDBAUsername", required = true)
    protected String dbFirebirdServerSYSDBAUsername;
    @XmlElement(name = "DB_FirebirdCharacterSet", required = true)
    protected String dbFirebirdCharacterSet;
    @XmlElement(name = "DB_FirebirdEmbeddedDatabase", required = true)
    protected String dbFirebirdEmbeddedDatabase;
    @XmlElement(name = "DB_FirebirdEmbeddedCharacterSet", required = true)
    protected String dbFirebirdEmbeddedCharacterSet;
    @XmlElement(name = "DB_DemoDatabase", required = true)
    protected String dbDemoDatabase;
    @XmlElement(name = "SubnetInheritance_Enabled")
    protected boolean subnetInheritanceEnabled;
    @XmlElement(name = "SubnetInheritance_Fields", required = true)
    protected TStringArray subnetInheritanceFields;
    @XmlElement(name = "Edit_MaximumMissingSubnets")
    protected int editMaximumMissingSubnets;
    @XmlElement(name = "Edit_LockRecords")
    protected boolean editLockRecords;
    @XmlElement(name = "Email_From", required = true)
    protected String emailFrom;
    @XmlElement(name = "Email_PasswordRequestBody", required = true)
    protected String emailPasswordRequestBody;
    @XmlElement(name = "Email_PasswordRequestSubject", required = true)
    protected String emailPasswordRequestSubject;
    @XmlElement(name = "Email_SMTPPassword", required = true)
    protected String emailSMTPPassword;
    @XmlElement(name = "Email_SMTPServer", required = true)
    protected String emailSMTPServer;
    @XmlElement(name = "Email_SMTPPort")
    protected int emailSMTPPort;
    @XmlElement(name = "Email_SMTPUsername", required = true)
    protected String emailSMTPUsername;
    @XmlElement(name = "Email_SMTPRequiresAuthentication")
    protected boolean emailSMTPRequiresAuthentication;
    @XmlElement(name = "Email_SMTPRequiresSSL")
    protected boolean emailSMTPRequiresSSL;
    @XmlElement(name = "Email_QueuePurgeDays")
    protected int emailQueuePurgeDays;
    @XmlElement(name = "Email_QueueCheckInterval")
    protected int emailQueueCheckInterval;
    @XmlElement(name = "Email_UsernameRequestBody", required = true)
    protected String emailUsernameRequestBody;
    @XmlElement(name = "Email_UsernameRequestSubject", required = true)
    protected String emailUsernameRequestSubject;
    @XmlElement(name = "Email_PasswordResetBody", required = true)
    protected String emailPasswordResetBody;
    @XmlElement(name = "Email_PasswordResetSubject", required = true)
    protected String emailPasswordResetSubject;
    @XmlElement(name = "Email_NewUserBody", required = true)
    protected String emailNewUserBody;
    @XmlElement(name = "Email_NewUserSubject", required = true)
    protected String emailNewUserSubject;
    @XmlElement(name = "Email_ServerRetryMinutes")
    protected int emailServerRetryMinutes;
    @XmlElement(name = "Logs_Directory", required = true)
    protected String logsDirectory;
    @XmlElement(name = "Logs_DirectoryPerDay")
    protected boolean logsDirectoryPerDay;
    @XmlElement(name = "Logs_FileLogLevel", required = true)
    @XmlSchemaType(name = "string")
    protected TLogLevel logsFileLogLevel;
    @XmlElement(name = "Logs_ControllerLogLevel", required = true)
    @XmlSchemaType(name = "string")
    protected TLogLevel logsControllerLogLevel;
    @XmlElement(name = "Logs_DebugIgnoreMethods", required = true)
    protected TStringArray logsDebugIgnoreMethods;
    @XmlElement(name = "Logs_LogRawBinPacketData")
    protected boolean logsLogRawBinPacketData;
    @XmlElement(name = "Logs_LogRawSOAPPacketData")
    protected boolean logsLogRawSOAPPacketData;
    @XmlElement(name = "Security_SSLCertificateFile", required = true)
    protected String securitySSLCertificateFile;
    @XmlElement(name = "Security_SSLKeyFile", required = true)
    protected String securitySSLKeyFile;
    @XmlElement(name = "Security_SSLPassPhrase", required = true)
    protected String securitySSLPassPhrase;
    @XmlElement(name = "Security_SSLRootCertificateFile", required = true)
    protected String securitySSLRootCertificateFile;
    @XmlElement(name = "Security_SSLVerificationDepth")
    protected int securitySSLVerificationDepth;
    @XmlElement(name = "Security_UseSSL")
    protected boolean securityUseSSL;
    @XmlElement(name = "Server_CompressData")
    protected boolean serverCompressData;
    @XmlElement(name = "Server_InactivityTimeout")
    protected int serverInactivityTimeout;
    @XmlElement(name = "Server_SessionTimeout")
    protected int serverSessionTimeout;
    @XmlElement(name = "Server_EncryptData")
    protected boolean serverEncryptData;
    @XmlElement(name = "Server_SendEncryptionKey", required = true)
    protected String serverSendEncryptionKey;
    @XmlElement(name = "Server_ReceiveEncryptionKey", required = true)
    protected String serverReceiveEncryptionKey;
    @XmlElement(name = "Server_EncryptionType", required = true)
    @XmlSchemaType(name = "string")
    protected TEncryptionType serverEncryptionType;
    @XmlElement(name = "Server_EncryptionPassword", required = true)
    protected String serverEncryptionPassword;
    @XmlElement(name = "Server_Port")
    protected int serverPort;
    @XmlElement(name = "Server_SSLPort")
    protected int serverSSLPort;
    @XmlElement(name = "Server_RemoteEventFrequency")
    protected int serverRemoteEventFrequency;
    @XmlElement(name = "Server_ClientRequestTimeout")
    protected int serverClientRequestTimeout;
    @XmlElement(name = "Server_MaxQueue")
    protected int serverMaxQueue;
    @XmlElement(name = "Server_PoolThreads")
    protected int serverPoolThreads;
    @XmlElement(name = "Server_MaxThreads")
    protected int serverMaxThreads;
    @XmlElement(name = "Server_ReservedLicencesCustom")
    protected int serverReservedLicencesCustom;
    @XmlElement(name = "VirtualFiles_AllowAdminsToDeleteNonEmptyDirectories")
    protected boolean virtualFilesAllowAdminsToDeleteNonEmptyDirectories;
    @XmlElement(name = "VirtualFiles_AllowUsersToDeleteNonEmptyDirectories")
    protected boolean virtualFilesAllowUsersToDeleteNonEmptyDirectories;
    @XmlElement(name = "VirtualFiles_CompressFiles")
    protected boolean virtualFilesCompressFiles;
    @XmlElement(name = "VirtualFiles_DefaultUserDirectory", required = true)
    protected String virtualFilesDefaultUserDirectory;
    @XmlElement(name = "VirtualFiles_MaximumVirtualFileSize")
    protected int virtualFilesMaximumVirtualFileSize;
    @XmlElement(name = "VirtualFiles_CacheVirtualFilesOnClients")
    protected boolean virtualFilesCacheVirtualFilesOnClients;
    @XmlElement(name = "Search_MaxResults")
    protected int searchMaxResults;
    @XmlElement(name = "Search_MinTokenLength")
    protected int searchMinTokenLength;
    @XmlElement(name = "Search_MaxTokenLength")
    protected int searchMaxTokenLength;
    @XmlElement(name = "BasicSearch_Enabled")
    protected boolean basicSearchEnabled;
    @XmlElement(name = "FTS_Enabled")
    protected boolean ftsEnabled;
    @XmlElement(name = "FTS_FieldDelimiters", required = true)
    protected String ftsFieldDelimiters;
    @XmlElement(name = "FTS_StopPhrases", required = true)
    protected TStringArray ftsStopPhrases;
    @XmlElement(name = "FTS_UpdateTimestamp", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ftsUpdateTimestamp;
    @XmlElement(name = "FTS_IndexingEnabled")
    protected boolean ftsIndexingEnabled;
    @XmlElement(name = "Reports_AvailableObjects", required = true)
    protected TReportObjects reportsAvailableObjects;
    @XmlElement(name = "PingLogging_Enabled")
    protected boolean pingLoggingEnabled;
    @XmlElement(name = "PingLogging_EnableForAllUsers")
    protected boolean pingLoggingEnableForAllUsers;
    @XmlElement(name = "PingLogging_UserIds", required = true)
    protected TInt64Array pingLoggingUserIds;
    @XmlElement(name = "Backup_FrequencyType", required = true)
    @XmlSchemaType(name = "string")
    protected TScheduleEventFrequencyType backupFrequencyType;
    @XmlElement(name = "Backup_Time", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar backupTime;
    @XmlElement(name = "Backup_Directory", required = true)
    protected String backupDirectory;
    @XmlElement(name = "Backup_TestRestore")
    protected boolean backupTestRestore;
    @XmlElement(name = "Backup_PurgeBackups")
    protected boolean backupPurgeBackups;
    @XmlElement(name = "Backup_PurgeDays")
    protected int backupPurgeDays;
    @XmlElement(name = "Backup_RestoreDirectory", required = true)
    protected String backupRestoreDirectory;
    @XmlElement(name = "Backup_PageSize")
    protected int backupPageSize;
    @XmlElement(name = "Backup_PurgeChangeLogs")
    protected boolean backupPurgeChangeLogs;
    @XmlElement(name = "Backup_PurgeChangeLogsDays")
    protected int backupPurgeChangeLogsDays;
    @XmlElement(name = "Backup_PurgePingLogs")
    protected boolean backupPurgePingLogs;
    @XmlElement(name = "Backup_PurgePingLogsDays")
    protected int backupPurgePingLogsDays;
    @XmlElement(name = "Backup_RecalculateDatabaseSelectivity")
    protected boolean backupRecalculateDatabaseSelectivity;
    @XmlElement(name = "Backup_EmailResults")
    protected boolean backupEmailResults;
    @XmlElement(name = "Backup_EmailRecipients", required = true)
    protected String backupEmailRecipients;
    @XmlElement(name = "Backup_EmailIncludeLog")
    protected boolean backupEmailIncludeLog;
    @XmlElement(name = "ChangeLogging_LogStructuralChanges")
    protected boolean changeLoggingLogStructuralChanges;
    @XmlElement(name = "ChangeLogging_DetailedChangeLogs")
    protected boolean changeLoggingDetailedChangeLogs;
    @XmlElement(name = "ChangeLogging_LogFieldRevisions")
    protected boolean changeLoggingLogFieldRevisions;
    @XmlElement(name = "ChangeLogging_LogFieldRevisionsWhenImporting")
    protected boolean changeLoggingLogFieldRevisionsWhenImporting;
    @XmlElement(name = "UserFiles_Directory", required = true)
    protected String userFilesDirectory;
    @XmlElement(name = "ClientUpdates_AllowLaterClientsToUpgrade")
    protected boolean clientUpdatesAllowLaterClientsToUpgrade;
    @XmlElement(name = "ClientUpdates_UpgradeType", required = true)
    @XmlSchemaType(name = "string")
    protected TClientUpgradeType clientUpdatesUpgradeType;
    @XmlElement(name = "UserRestrictions_MinAdminLevelCreateAN", required = true)
    @XmlSchemaType(name = "string")
    protected TUserType userRestrictionsMinAdminLevelCreateAN;
    @XmlElement(name = "DiscoveryBots_QueueCheckFrequency")
    protected int discoveryBotsQueueCheckFrequency;
    @XmlElement(name = "SOAPServer_Enabled")
    protected boolean soapServerEnabled;
    @XmlElement(name = "SOAPServer_Port")
    protected int soapServerPort;
    @XmlElement(name = "SOAPServer_SSLPort")
    protected int soapServerSSLPort;
    @XmlElement(name = "SOAPServer_WriteMultiRefArray")
    protected boolean soapServerWriteMultiRefArray;
    @XmlElement(name = "SOAPServer_WriteMultiRefObject")
    protected boolean soapServerWriteMultiRefObject;
    @XmlElement(name = "SOAPServer_SendUntyped")
    protected boolean soapServerSendUntyped;
    @XmlElement(name = "SOAPServer_StrictStructureFieldOrder")
    protected boolean soapServerStrictStructureFieldOrder;
    @XmlElement(name = "SOAPServer_EncodedXML")
    protected boolean soapServerEncodedXML;
    @XmlElement(name = "SOAPServer_ClientIDInWSDL")
    protected boolean soapServerClientIDInWSDL;
    @XmlElement(name = "SOAPServer_Document")
    protected boolean soapServerDocument;
    @XmlElement(name = "SOAPServer_ExternalTypesAsReferences")
    protected boolean soapServerExternalTypesAsReferences;
    @XmlElement(name = "SOAPServer_SOAP12")
    protected boolean soapServerSOAP12;
    @XmlElement(name = "SOAPServer_SOAPMode", required = true)
    @XmlSchemaType(name = "string")
    protected TSOAPMode soapServerSOAPMode;

    /**
     * Gets the value of the accountsMinimumPasswordLength property.
     * 
     */
    public int getAccountsMinimumPasswordLength() {
        return accountsMinimumPasswordLength;
    }

    /**
     * Sets the value of the accountsMinimumPasswordLength property.
     * 
     */
    public void setAccountsMinimumPasswordLength(int value) {
        this.accountsMinimumPasswordLength = value;
    }

    /**
     * Gets the value of the dbDatabaseServerType property.
     * 
     * @return
     *     possible object is
     *     {@link TServerType }
     *     
     */
    public TServerType getDBDatabaseServerType() {
        return dbDatabaseServerType;
    }

    /**
     * Sets the value of the dbDatabaseServerType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TServerType }
     *     
     */
    public void setDBDatabaseServerType(TServerType value) {
        this.dbDatabaseServerType = value;
    }

    /**
     * Gets the value of the dbFirebirdServerDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdServerDatabase() {
        return dbFirebirdServerDatabase;
    }

    /**
     * Sets the value of the dbFirebirdServerDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdServerDatabase(String value) {
        this.dbFirebirdServerDatabase = value;
    }

    /**
     * Gets the value of the dbFirebirdServerPort property.
     * 
     */
    public int getDBFirebirdServerPort() {
        return dbFirebirdServerPort;
    }

    /**
     * Sets the value of the dbFirebirdServerPort property.
     * 
     */
    public void setDBFirebirdServerPort(int value) {
        this.dbFirebirdServerPort = value;
    }

    /**
     * Gets the value of the dbFirebirdServerServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdServerServer() {
        return dbFirebirdServerServer;
    }

    /**
     * Sets the value of the dbFirebirdServerServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdServerServer(String value) {
        this.dbFirebirdServerServer = value;
    }

    /**
     * Gets the value of the dbFirebirdServerSYSDBAPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdServerSYSDBAPassword() {
        return dbFirebirdServerSYSDBAPassword;
    }

    /**
     * Sets the value of the dbFirebirdServerSYSDBAPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdServerSYSDBAPassword(String value) {
        this.dbFirebirdServerSYSDBAPassword = value;
    }

    /**
     * Gets the value of the dbFirebirdServerSYSDBAUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdServerSYSDBAUsername() {
        return dbFirebirdServerSYSDBAUsername;
    }

    /**
     * Sets the value of the dbFirebirdServerSYSDBAUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdServerSYSDBAUsername(String value) {
        this.dbFirebirdServerSYSDBAUsername = value;
    }

    /**
     * Gets the value of the dbFirebirdCharacterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdCharacterSet() {
        return dbFirebirdCharacterSet;
    }

    /**
     * Sets the value of the dbFirebirdCharacterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdCharacterSet(String value) {
        this.dbFirebirdCharacterSet = value;
    }

    /**
     * Gets the value of the dbFirebirdEmbeddedDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdEmbeddedDatabase() {
        return dbFirebirdEmbeddedDatabase;
    }

    /**
     * Sets the value of the dbFirebirdEmbeddedDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdEmbeddedDatabase(String value) {
        this.dbFirebirdEmbeddedDatabase = value;
    }

    /**
     * Gets the value of the dbFirebirdEmbeddedCharacterSet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBFirebirdEmbeddedCharacterSet() {
        return dbFirebirdEmbeddedCharacterSet;
    }

    /**
     * Sets the value of the dbFirebirdEmbeddedCharacterSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBFirebirdEmbeddedCharacterSet(String value) {
        this.dbFirebirdEmbeddedCharacterSet = value;
    }

    /**
     * Gets the value of the dbDemoDatabase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBDemoDatabase() {
        return dbDemoDatabase;
    }

    /**
     * Sets the value of the dbDemoDatabase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBDemoDatabase(String value) {
        this.dbDemoDatabase = value;
    }

    /**
     * Gets the value of the subnetInheritanceEnabled property.
     * 
     */
    public boolean isSubnetInheritanceEnabled() {
        return subnetInheritanceEnabled;
    }

    /**
     * Sets the value of the subnetInheritanceEnabled property.
     * 
     */
    public void setSubnetInheritanceEnabled(boolean value) {
        this.subnetInheritanceEnabled = value;
    }

    /**
     * Gets the value of the subnetInheritanceFields property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getSubnetInheritanceFields() {
        return subnetInheritanceFields;
    }

    /**
     * Sets the value of the subnetInheritanceFields property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setSubnetInheritanceFields(TStringArray value) {
        this.subnetInheritanceFields = value;
    }

    /**
     * Gets the value of the editMaximumMissingSubnets property.
     * 
     */
    public int getEditMaximumMissingSubnets() {
        return editMaximumMissingSubnets;
    }

    /**
     * Sets the value of the editMaximumMissingSubnets property.
     * 
     */
    public void setEditMaximumMissingSubnets(int value) {
        this.editMaximumMissingSubnets = value;
    }

    /**
     * Gets the value of the editLockRecords property.
     * 
     */
    public boolean isEditLockRecords() {
        return editLockRecords;
    }

    /**
     * Sets the value of the editLockRecords property.
     * 
     */
    public void setEditLockRecords(boolean value) {
        this.editLockRecords = value;
    }

    /**
     * Gets the value of the emailFrom property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailFrom() {
        return emailFrom;
    }

    /**
     * Sets the value of the emailFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailFrom(String value) {
        this.emailFrom = value;
    }

    /**
     * Gets the value of the emailPasswordRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPasswordRequestBody() {
        return emailPasswordRequestBody;
    }

    /**
     * Sets the value of the emailPasswordRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPasswordRequestBody(String value) {
        this.emailPasswordRequestBody = value;
    }

    /**
     * Gets the value of the emailPasswordRequestSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPasswordRequestSubject() {
        return emailPasswordRequestSubject;
    }

    /**
     * Sets the value of the emailPasswordRequestSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPasswordRequestSubject(String value) {
        this.emailPasswordRequestSubject = value;
    }

    /**
     * Gets the value of the emailSMTPPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSMTPPassword() {
        return emailSMTPPassword;
    }

    /**
     * Sets the value of the emailSMTPPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSMTPPassword(String value) {
        this.emailSMTPPassword = value;
    }

    /**
     * Gets the value of the emailSMTPServer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSMTPServer() {
        return emailSMTPServer;
    }

    /**
     * Sets the value of the emailSMTPServer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSMTPServer(String value) {
        this.emailSMTPServer = value;
    }

    /**
     * Gets the value of the emailSMTPPort property.
     * 
     */
    public int getEmailSMTPPort() {
        return emailSMTPPort;
    }

    /**
     * Sets the value of the emailSMTPPort property.
     * 
     */
    public void setEmailSMTPPort(int value) {
        this.emailSMTPPort = value;
    }

    /**
     * Gets the value of the emailSMTPUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailSMTPUsername() {
        return emailSMTPUsername;
    }

    /**
     * Sets the value of the emailSMTPUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailSMTPUsername(String value) {
        this.emailSMTPUsername = value;
    }

    /**
     * Gets the value of the emailSMTPRequiresAuthentication property.
     * 
     */
    public boolean isEmailSMTPRequiresAuthentication() {
        return emailSMTPRequiresAuthentication;
    }

    /**
     * Sets the value of the emailSMTPRequiresAuthentication property.
     * 
     */
    public void setEmailSMTPRequiresAuthentication(boolean value) {
        this.emailSMTPRequiresAuthentication = value;
    }

    /**
     * Gets the value of the emailSMTPRequiresSSL property.
     * 
     */
    public boolean isEmailSMTPRequiresSSL() {
        return emailSMTPRequiresSSL;
    }

    /**
     * Sets the value of the emailSMTPRequiresSSL property.
     * 
     */
    public void setEmailSMTPRequiresSSL(boolean value) {
        this.emailSMTPRequiresSSL = value;
    }

    /**
     * Gets the value of the emailQueuePurgeDays property.
     * 
     */
    public int getEmailQueuePurgeDays() {
        return emailQueuePurgeDays;
    }

    /**
     * Sets the value of the emailQueuePurgeDays property.
     * 
     */
    public void setEmailQueuePurgeDays(int value) {
        this.emailQueuePurgeDays = value;
    }

    /**
     * Gets the value of the emailQueueCheckInterval property.
     * 
     */
    public int getEmailQueueCheckInterval() {
        return emailQueueCheckInterval;
    }

    /**
     * Sets the value of the emailQueueCheckInterval property.
     * 
     */
    public void setEmailQueueCheckInterval(int value) {
        this.emailQueueCheckInterval = value;
    }

    /**
     * Gets the value of the emailUsernameRequestBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUsernameRequestBody() {
        return emailUsernameRequestBody;
    }

    /**
     * Sets the value of the emailUsernameRequestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUsernameRequestBody(String value) {
        this.emailUsernameRequestBody = value;
    }

    /**
     * Gets the value of the emailUsernameRequestSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailUsernameRequestSubject() {
        return emailUsernameRequestSubject;
    }

    /**
     * Sets the value of the emailUsernameRequestSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailUsernameRequestSubject(String value) {
        this.emailUsernameRequestSubject = value;
    }

    /**
     * Gets the value of the emailPasswordResetBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPasswordResetBody() {
        return emailPasswordResetBody;
    }

    /**
     * Sets the value of the emailPasswordResetBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPasswordResetBody(String value) {
        this.emailPasswordResetBody = value;
    }

    /**
     * Gets the value of the emailPasswordResetSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailPasswordResetSubject() {
        return emailPasswordResetSubject;
    }

    /**
     * Sets the value of the emailPasswordResetSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailPasswordResetSubject(String value) {
        this.emailPasswordResetSubject = value;
    }

    /**
     * Gets the value of the emailNewUserBody property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailNewUserBody() {
        return emailNewUserBody;
    }

    /**
     * Sets the value of the emailNewUserBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailNewUserBody(String value) {
        this.emailNewUserBody = value;
    }

    /**
     * Gets the value of the emailNewUserSubject property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailNewUserSubject() {
        return emailNewUserSubject;
    }

    /**
     * Sets the value of the emailNewUserSubject property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailNewUserSubject(String value) {
        this.emailNewUserSubject = value;
    }

    /**
     * Gets the value of the emailServerRetryMinutes property.
     * 
     */
    public int getEmailServerRetryMinutes() {
        return emailServerRetryMinutes;
    }

    /**
     * Sets the value of the emailServerRetryMinutes property.
     * 
     */
    public void setEmailServerRetryMinutes(int value) {
        this.emailServerRetryMinutes = value;
    }

    /**
     * Gets the value of the logsDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogsDirectory() {
        return logsDirectory;
    }

    /**
     * Sets the value of the logsDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogsDirectory(String value) {
        this.logsDirectory = value;
    }

    /**
     * Gets the value of the logsDirectoryPerDay property.
     * 
     */
    public boolean isLogsDirectoryPerDay() {
        return logsDirectoryPerDay;
    }

    /**
     * Sets the value of the logsDirectoryPerDay property.
     * 
     */
    public void setLogsDirectoryPerDay(boolean value) {
        this.logsDirectoryPerDay = value;
    }

    /**
     * Gets the value of the logsFileLogLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TLogLevel }
     *     
     */
    public TLogLevel getLogsFileLogLevel() {
        return logsFileLogLevel;
    }

    /**
     * Sets the value of the logsFileLogLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLogLevel }
     *     
     */
    public void setLogsFileLogLevel(TLogLevel value) {
        this.logsFileLogLevel = value;
    }

    /**
     * Gets the value of the logsControllerLogLevel property.
     * 
     * @return
     *     possible object is
     *     {@link TLogLevel }
     *     
     */
    public TLogLevel getLogsControllerLogLevel() {
        return logsControllerLogLevel;
    }

    /**
     * Sets the value of the logsControllerLogLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLogLevel }
     *     
     */
    public void setLogsControllerLogLevel(TLogLevel value) {
        this.logsControllerLogLevel = value;
    }

    /**
     * Gets the value of the logsDebugIgnoreMethods property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getLogsDebugIgnoreMethods() {
        return logsDebugIgnoreMethods;
    }

    /**
     * Sets the value of the logsDebugIgnoreMethods property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setLogsDebugIgnoreMethods(TStringArray value) {
        this.logsDebugIgnoreMethods = value;
    }

    /**
     * Gets the value of the logsLogRawBinPacketData property.
     * 
     */
    public boolean isLogsLogRawBinPacketData() {
        return logsLogRawBinPacketData;
    }

    /**
     * Sets the value of the logsLogRawBinPacketData property.
     * 
     */
    public void setLogsLogRawBinPacketData(boolean value) {
        this.logsLogRawBinPacketData = value;
    }

    /**
     * Gets the value of the logsLogRawSOAPPacketData property.
     * 
     */
    public boolean isLogsLogRawSOAPPacketData() {
        return logsLogRawSOAPPacketData;
    }

    /**
     * Sets the value of the logsLogRawSOAPPacketData property.
     * 
     */
    public void setLogsLogRawSOAPPacketData(boolean value) {
        this.logsLogRawSOAPPacketData = value;
    }

    /**
     * Gets the value of the securitySSLCertificateFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySSLCertificateFile() {
        return securitySSLCertificateFile;
    }

    /**
     * Sets the value of the securitySSLCertificateFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySSLCertificateFile(String value) {
        this.securitySSLCertificateFile = value;
    }

    /**
     * Gets the value of the securitySSLKeyFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySSLKeyFile() {
        return securitySSLKeyFile;
    }

    /**
     * Sets the value of the securitySSLKeyFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySSLKeyFile(String value) {
        this.securitySSLKeyFile = value;
    }

    /**
     * Gets the value of the securitySSLPassPhrase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySSLPassPhrase() {
        return securitySSLPassPhrase;
    }

    /**
     * Sets the value of the securitySSLPassPhrase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySSLPassPhrase(String value) {
        this.securitySSLPassPhrase = value;
    }

    /**
     * Gets the value of the securitySSLRootCertificateFile property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecuritySSLRootCertificateFile() {
        return securitySSLRootCertificateFile;
    }

    /**
     * Sets the value of the securitySSLRootCertificateFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecuritySSLRootCertificateFile(String value) {
        this.securitySSLRootCertificateFile = value;
    }

    /**
     * Gets the value of the securitySSLVerificationDepth property.
     * 
     */
    public int getSecuritySSLVerificationDepth() {
        return securitySSLVerificationDepth;
    }

    /**
     * Sets the value of the securitySSLVerificationDepth property.
     * 
     */
    public void setSecuritySSLVerificationDepth(int value) {
        this.securitySSLVerificationDepth = value;
    }

    /**
     * Gets the value of the securityUseSSL property.
     * 
     */
    public boolean isSecurityUseSSL() {
        return securityUseSSL;
    }

    /**
     * Sets the value of the securityUseSSL property.
     * 
     */
    public void setSecurityUseSSL(boolean value) {
        this.securityUseSSL = value;
    }

    /**
     * Gets the value of the serverCompressData property.
     * 
     */
    public boolean isServerCompressData() {
        return serverCompressData;
    }

    /**
     * Sets the value of the serverCompressData property.
     * 
     */
    public void setServerCompressData(boolean value) {
        this.serverCompressData = value;
    }

    /**
     * Gets the value of the serverInactivityTimeout property.
     * 
     */
    public int getServerInactivityTimeout() {
        return serverInactivityTimeout;
    }

    /**
     * Sets the value of the serverInactivityTimeout property.
     * 
     */
    public void setServerInactivityTimeout(int value) {
        this.serverInactivityTimeout = value;
    }

    /**
     * Gets the value of the serverSessionTimeout property.
     * 
     */
    public int getServerSessionTimeout() {
        return serverSessionTimeout;
    }

    /**
     * Sets the value of the serverSessionTimeout property.
     * 
     */
    public void setServerSessionTimeout(int value) {
        this.serverSessionTimeout = value;
    }

    /**
     * Gets the value of the serverEncryptData property.
     * 
     */
    public boolean isServerEncryptData() {
        return serverEncryptData;
    }

    /**
     * Sets the value of the serverEncryptData property.
     * 
     */
    public void setServerEncryptData(boolean value) {
        this.serverEncryptData = value;
    }

    /**
     * Gets the value of the serverSendEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerSendEncryptionKey() {
        return serverSendEncryptionKey;
    }

    /**
     * Sets the value of the serverSendEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerSendEncryptionKey(String value) {
        this.serverSendEncryptionKey = value;
    }

    /**
     * Gets the value of the serverReceiveEncryptionKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerReceiveEncryptionKey() {
        return serverReceiveEncryptionKey;
    }

    /**
     * Sets the value of the serverReceiveEncryptionKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerReceiveEncryptionKey(String value) {
        this.serverReceiveEncryptionKey = value;
    }

    /**
     * Gets the value of the serverEncryptionType property.
     * 
     * @return
     *     possible object is
     *     {@link TEncryptionType }
     *     
     */
    public TEncryptionType getServerEncryptionType() {
        return serverEncryptionType;
    }

    /**
     * Sets the value of the serverEncryptionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TEncryptionType }
     *     
     */
    public void setServerEncryptionType(TEncryptionType value) {
        this.serverEncryptionType = value;
    }

    /**
     * Gets the value of the serverEncryptionPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServerEncryptionPassword() {
        return serverEncryptionPassword;
    }

    /**
     * Sets the value of the serverEncryptionPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServerEncryptionPassword(String value) {
        this.serverEncryptionPassword = value;
    }

    /**
     * Gets the value of the serverPort property.
     * 
     */
    public int getServerPort() {
        return serverPort;
    }

    /**
     * Sets the value of the serverPort property.
     * 
     */
    public void setServerPort(int value) {
        this.serverPort = value;
    }

    /**
     * Gets the value of the serverSSLPort property.
     * 
     */
    public int getServerSSLPort() {
        return serverSSLPort;
    }

    /**
     * Sets the value of the serverSSLPort property.
     * 
     */
    public void setServerSSLPort(int value) {
        this.serverSSLPort = value;
    }

    /**
     * Gets the value of the serverRemoteEventFrequency property.
     * 
     */
    public int getServerRemoteEventFrequency() {
        return serverRemoteEventFrequency;
    }

    /**
     * Sets the value of the serverRemoteEventFrequency property.
     * 
     */
    public void setServerRemoteEventFrequency(int value) {
        this.serverRemoteEventFrequency = value;
    }

    /**
     * Gets the value of the serverClientRequestTimeout property.
     * 
     */
    public int getServerClientRequestTimeout() {
        return serverClientRequestTimeout;
    }

    /**
     * Sets the value of the serverClientRequestTimeout property.
     * 
     */
    public void setServerClientRequestTimeout(int value) {
        this.serverClientRequestTimeout = value;
    }

    /**
     * Gets the value of the serverMaxQueue property.
     * 
     */
    public int getServerMaxQueue() {
        return serverMaxQueue;
    }

    /**
     * Sets the value of the serverMaxQueue property.
     * 
     */
    public void setServerMaxQueue(int value) {
        this.serverMaxQueue = value;
    }

    /**
     * Gets the value of the serverPoolThreads property.
     * 
     */
    public int getServerPoolThreads() {
        return serverPoolThreads;
    }

    /**
     * Sets the value of the serverPoolThreads property.
     * 
     */
    public void setServerPoolThreads(int value) {
        this.serverPoolThreads = value;
    }

    /**
     * Gets the value of the serverMaxThreads property.
     * 
     */
    public int getServerMaxThreads() {
        return serverMaxThreads;
    }

    /**
     * Sets the value of the serverMaxThreads property.
     * 
     */
    public void setServerMaxThreads(int value) {
        this.serverMaxThreads = value;
    }

    /**
     * Gets the value of the serverReservedLicencesCustom property.
     * 
     */
    public int getServerReservedLicencesCustom() {
        return serverReservedLicencesCustom;
    }

    /**
     * Sets the value of the serverReservedLicencesCustom property.
     * 
     */
    public void setServerReservedLicencesCustom(int value) {
        this.serverReservedLicencesCustom = value;
    }

    /**
     * Gets the value of the virtualFilesAllowAdminsToDeleteNonEmptyDirectories property.
     * 
     */
    public boolean isVirtualFilesAllowAdminsToDeleteNonEmptyDirectories() {
        return virtualFilesAllowAdminsToDeleteNonEmptyDirectories;
    }

    /**
     * Sets the value of the virtualFilesAllowAdminsToDeleteNonEmptyDirectories property.
     * 
     */
    public void setVirtualFilesAllowAdminsToDeleteNonEmptyDirectories(boolean value) {
        this.virtualFilesAllowAdminsToDeleteNonEmptyDirectories = value;
    }

    /**
     * Gets the value of the virtualFilesAllowUsersToDeleteNonEmptyDirectories property.
     * 
     */
    public boolean isVirtualFilesAllowUsersToDeleteNonEmptyDirectories() {
        return virtualFilesAllowUsersToDeleteNonEmptyDirectories;
    }

    /**
     * Sets the value of the virtualFilesAllowUsersToDeleteNonEmptyDirectories property.
     * 
     */
    public void setVirtualFilesAllowUsersToDeleteNonEmptyDirectories(boolean value) {
        this.virtualFilesAllowUsersToDeleteNonEmptyDirectories = value;
    }

    /**
     * Gets the value of the virtualFilesCompressFiles property.
     * 
     */
    public boolean isVirtualFilesCompressFiles() {
        return virtualFilesCompressFiles;
    }

    /**
     * Sets the value of the virtualFilesCompressFiles property.
     * 
     */
    public void setVirtualFilesCompressFiles(boolean value) {
        this.virtualFilesCompressFiles = value;
    }

    /**
     * Gets the value of the virtualFilesDefaultUserDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualFilesDefaultUserDirectory() {
        return virtualFilesDefaultUserDirectory;
    }

    /**
     * Sets the value of the virtualFilesDefaultUserDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualFilesDefaultUserDirectory(String value) {
        this.virtualFilesDefaultUserDirectory = value;
    }

    /**
     * Gets the value of the virtualFilesMaximumVirtualFileSize property.
     * 
     */
    public int getVirtualFilesMaximumVirtualFileSize() {
        return virtualFilesMaximumVirtualFileSize;
    }

    /**
     * Sets the value of the virtualFilesMaximumVirtualFileSize property.
     * 
     */
    public void setVirtualFilesMaximumVirtualFileSize(int value) {
        this.virtualFilesMaximumVirtualFileSize = value;
    }

    /**
     * Gets the value of the virtualFilesCacheVirtualFilesOnClients property.
     * 
     */
    public boolean isVirtualFilesCacheVirtualFilesOnClients() {
        return virtualFilesCacheVirtualFilesOnClients;
    }

    /**
     * Sets the value of the virtualFilesCacheVirtualFilesOnClients property.
     * 
     */
    public void setVirtualFilesCacheVirtualFilesOnClients(boolean value) {
        this.virtualFilesCacheVirtualFilesOnClients = value;
    }

    /**
     * Gets the value of the searchMaxResults property.
     * 
     */
    public int getSearchMaxResults() {
        return searchMaxResults;
    }

    /**
     * Sets the value of the searchMaxResults property.
     * 
     */
    public void setSearchMaxResults(int value) {
        this.searchMaxResults = value;
    }

    /**
     * Gets the value of the searchMinTokenLength property.
     * 
     */
    public int getSearchMinTokenLength() {
        return searchMinTokenLength;
    }

    /**
     * Sets the value of the searchMinTokenLength property.
     * 
     */
    public void setSearchMinTokenLength(int value) {
        this.searchMinTokenLength = value;
    }

    /**
     * Gets the value of the searchMaxTokenLength property.
     * 
     */
    public int getSearchMaxTokenLength() {
        return searchMaxTokenLength;
    }

    /**
     * Sets the value of the searchMaxTokenLength property.
     * 
     */
    public void setSearchMaxTokenLength(int value) {
        this.searchMaxTokenLength = value;
    }

    /**
     * Gets the value of the basicSearchEnabled property.
     * 
     */
    public boolean isBasicSearchEnabled() {
        return basicSearchEnabled;
    }

    /**
     * Sets the value of the basicSearchEnabled property.
     * 
     */
    public void setBasicSearchEnabled(boolean value) {
        this.basicSearchEnabled = value;
    }

    /**
     * Gets the value of the ftsEnabled property.
     * 
     */
    public boolean isFTSEnabled() {
        return ftsEnabled;
    }

    /**
     * Sets the value of the ftsEnabled property.
     * 
     */
    public void setFTSEnabled(boolean value) {
        this.ftsEnabled = value;
    }

    /**
     * Gets the value of the ftsFieldDelimiters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTSFieldDelimiters() {
        return ftsFieldDelimiters;
    }

    /**
     * Sets the value of the ftsFieldDelimiters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTSFieldDelimiters(String value) {
        this.ftsFieldDelimiters = value;
    }

    /**
     * Gets the value of the ftsStopPhrases property.
     * 
     * @return
     *     possible object is
     *     {@link TStringArray }
     *     
     */
    public TStringArray getFTSStopPhrases() {
        return ftsStopPhrases;
    }

    /**
     * Sets the value of the ftsStopPhrases property.
     * 
     * @param value
     *     allowed object is
     *     {@link TStringArray }
     *     
     */
    public void setFTSStopPhrases(TStringArray value) {
        this.ftsStopPhrases = value;
    }

    /**
     * Gets the value of the ftsUpdateTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFTSUpdateTimestamp() {
        return ftsUpdateTimestamp;
    }

    /**
     * Sets the value of the ftsUpdateTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFTSUpdateTimestamp(XMLGregorianCalendar value) {
        this.ftsUpdateTimestamp = value;
    }

    /**
     * Gets the value of the ftsIndexingEnabled property.
     * 
     */
    public boolean isFTSIndexingEnabled() {
        return ftsIndexingEnabled;
    }

    /**
     * Sets the value of the ftsIndexingEnabled property.
     * 
     */
    public void setFTSIndexingEnabled(boolean value) {
        this.ftsIndexingEnabled = value;
    }

    /**
     * Gets the value of the reportsAvailableObjects property.
     * 
     * @return
     *     possible object is
     *     {@link TReportObjects }
     *     
     */
    public TReportObjects getReportsAvailableObjects() {
        return reportsAvailableObjects;
    }

    /**
     * Sets the value of the reportsAvailableObjects property.
     * 
     * @param value
     *     allowed object is
     *     {@link TReportObjects }
     *     
     */
    public void setReportsAvailableObjects(TReportObjects value) {
        this.reportsAvailableObjects = value;
    }

    /**
     * Gets the value of the pingLoggingEnabled property.
     * 
     */
    public boolean isPingLoggingEnabled() {
        return pingLoggingEnabled;
    }

    /**
     * Sets the value of the pingLoggingEnabled property.
     * 
     */
    public void setPingLoggingEnabled(boolean value) {
        this.pingLoggingEnabled = value;
    }

    /**
     * Gets the value of the pingLoggingEnableForAllUsers property.
     * 
     */
    public boolean isPingLoggingEnableForAllUsers() {
        return pingLoggingEnableForAllUsers;
    }

    /**
     * Sets the value of the pingLoggingEnableForAllUsers property.
     * 
     */
    public void setPingLoggingEnableForAllUsers(boolean value) {
        this.pingLoggingEnableForAllUsers = value;
    }

    /**
     * Gets the value of the pingLoggingUserIds property.
     * 
     * @return
     *     possible object is
     *     {@link TInt64Array }
     *     
     */
    public TInt64Array getPingLoggingUserIds() {
        return pingLoggingUserIds;
    }

    /**
     * Sets the value of the pingLoggingUserIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link TInt64Array }
     *     
     */
    public void setPingLoggingUserIds(TInt64Array value) {
        this.pingLoggingUserIds = value;
    }

    /**
     * Gets the value of the backupFrequencyType property.
     * 
     * @return
     *     possible object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public TScheduleEventFrequencyType getBackupFrequencyType() {
        return backupFrequencyType;
    }

    /**
     * Sets the value of the backupFrequencyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TScheduleEventFrequencyType }
     *     
     */
    public void setBackupFrequencyType(TScheduleEventFrequencyType value) {
        this.backupFrequencyType = value;
    }

    /**
     * Gets the value of the backupTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBackupTime() {
        return backupTime;
    }

    /**
     * Sets the value of the backupTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBackupTime(XMLGregorianCalendar value) {
        this.backupTime = value;
    }

    /**
     * Gets the value of the backupDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupDirectory() {
        return backupDirectory;
    }

    /**
     * Sets the value of the backupDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupDirectory(String value) {
        this.backupDirectory = value;
    }

    /**
     * Gets the value of the backupTestRestore property.
     * 
     */
    public boolean isBackupTestRestore() {
        return backupTestRestore;
    }

    /**
     * Sets the value of the backupTestRestore property.
     * 
     */
    public void setBackupTestRestore(boolean value) {
        this.backupTestRestore = value;
    }

    /**
     * Gets the value of the backupPurgeBackups property.
     * 
     */
    public boolean isBackupPurgeBackups() {
        return backupPurgeBackups;
    }

    /**
     * Sets the value of the backupPurgeBackups property.
     * 
     */
    public void setBackupPurgeBackups(boolean value) {
        this.backupPurgeBackups = value;
    }

    /**
     * Gets the value of the backupPurgeDays property.
     * 
     */
    public int getBackupPurgeDays() {
        return backupPurgeDays;
    }

    /**
     * Sets the value of the backupPurgeDays property.
     * 
     */
    public void setBackupPurgeDays(int value) {
        this.backupPurgeDays = value;
    }

    /**
     * Gets the value of the backupRestoreDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupRestoreDirectory() {
        return backupRestoreDirectory;
    }

    /**
     * Sets the value of the backupRestoreDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupRestoreDirectory(String value) {
        this.backupRestoreDirectory = value;
    }

    /**
     * Gets the value of the backupPageSize property.
     * 
     */
    public int getBackupPageSize() {
        return backupPageSize;
    }

    /**
     * Sets the value of the backupPageSize property.
     * 
     */
    public void setBackupPageSize(int value) {
        this.backupPageSize = value;
    }

    /**
     * Gets the value of the backupPurgeChangeLogs property.
     * 
     */
    public boolean isBackupPurgeChangeLogs() {
        return backupPurgeChangeLogs;
    }

    /**
     * Sets the value of the backupPurgeChangeLogs property.
     * 
     */
    public void setBackupPurgeChangeLogs(boolean value) {
        this.backupPurgeChangeLogs = value;
    }

    /**
     * Gets the value of the backupPurgeChangeLogsDays property.
     * 
     */
    public int getBackupPurgeChangeLogsDays() {
        return backupPurgeChangeLogsDays;
    }

    /**
     * Sets the value of the backupPurgeChangeLogsDays property.
     * 
     */
    public void setBackupPurgeChangeLogsDays(int value) {
        this.backupPurgeChangeLogsDays = value;
    }

    /**
     * Gets the value of the backupPurgePingLogs property.
     * 
     */
    public boolean isBackupPurgePingLogs() {
        return backupPurgePingLogs;
    }

    /**
     * Sets the value of the backupPurgePingLogs property.
     * 
     */
    public void setBackupPurgePingLogs(boolean value) {
        this.backupPurgePingLogs = value;
    }

    /**
     * Gets the value of the backupPurgePingLogsDays property.
     * 
     */
    public int getBackupPurgePingLogsDays() {
        return backupPurgePingLogsDays;
    }

    /**
     * Sets the value of the backupPurgePingLogsDays property.
     * 
     */
    public void setBackupPurgePingLogsDays(int value) {
        this.backupPurgePingLogsDays = value;
    }

    /**
     * Gets the value of the backupRecalculateDatabaseSelectivity property.
     * 
     */
    public boolean isBackupRecalculateDatabaseSelectivity() {
        return backupRecalculateDatabaseSelectivity;
    }

    /**
     * Sets the value of the backupRecalculateDatabaseSelectivity property.
     * 
     */
    public void setBackupRecalculateDatabaseSelectivity(boolean value) {
        this.backupRecalculateDatabaseSelectivity = value;
    }

    /**
     * Gets the value of the backupEmailResults property.
     * 
     */
    public boolean isBackupEmailResults() {
        return backupEmailResults;
    }

    /**
     * Sets the value of the backupEmailResults property.
     * 
     */
    public void setBackupEmailResults(boolean value) {
        this.backupEmailResults = value;
    }

    /**
     * Gets the value of the backupEmailRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBackupEmailRecipients() {
        return backupEmailRecipients;
    }

    /**
     * Sets the value of the backupEmailRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBackupEmailRecipients(String value) {
        this.backupEmailRecipients = value;
    }

    /**
     * Gets the value of the backupEmailIncludeLog property.
     * 
     */
    public boolean isBackupEmailIncludeLog() {
        return backupEmailIncludeLog;
    }

    /**
     * Sets the value of the backupEmailIncludeLog property.
     * 
     */
    public void setBackupEmailIncludeLog(boolean value) {
        this.backupEmailIncludeLog = value;
    }

    /**
     * Gets the value of the changeLoggingLogStructuralChanges property.
     * 
     */
    public boolean isChangeLoggingLogStructuralChanges() {
        return changeLoggingLogStructuralChanges;
    }

    /**
     * Sets the value of the changeLoggingLogStructuralChanges property.
     * 
     */
    public void setChangeLoggingLogStructuralChanges(boolean value) {
        this.changeLoggingLogStructuralChanges = value;
    }

    /**
     * Gets the value of the changeLoggingDetailedChangeLogs property.
     * 
     */
    public boolean isChangeLoggingDetailedChangeLogs() {
        return changeLoggingDetailedChangeLogs;
    }

    /**
     * Sets the value of the changeLoggingDetailedChangeLogs property.
     * 
     */
    public void setChangeLoggingDetailedChangeLogs(boolean value) {
        this.changeLoggingDetailedChangeLogs = value;
    }

    /**
     * Gets the value of the changeLoggingLogFieldRevisions property.
     * 
     */
    public boolean isChangeLoggingLogFieldRevisions() {
        return changeLoggingLogFieldRevisions;
    }

    /**
     * Sets the value of the changeLoggingLogFieldRevisions property.
     * 
     */
    public void setChangeLoggingLogFieldRevisions(boolean value) {
        this.changeLoggingLogFieldRevisions = value;
    }

    /**
     * Gets the value of the changeLoggingLogFieldRevisionsWhenImporting property.
     * 
     */
    public boolean isChangeLoggingLogFieldRevisionsWhenImporting() {
        return changeLoggingLogFieldRevisionsWhenImporting;
    }

    /**
     * Sets the value of the changeLoggingLogFieldRevisionsWhenImporting property.
     * 
     */
    public void setChangeLoggingLogFieldRevisionsWhenImporting(boolean value) {
        this.changeLoggingLogFieldRevisionsWhenImporting = value;
    }

    /**
     * Gets the value of the userFilesDirectory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserFilesDirectory() {
        return userFilesDirectory;
    }

    /**
     * Sets the value of the userFilesDirectory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserFilesDirectory(String value) {
        this.userFilesDirectory = value;
    }

    /**
     * Gets the value of the clientUpdatesAllowLaterClientsToUpgrade property.
     * 
     */
    public boolean isClientUpdatesAllowLaterClientsToUpgrade() {
        return clientUpdatesAllowLaterClientsToUpgrade;
    }

    /**
     * Sets the value of the clientUpdatesAllowLaterClientsToUpgrade property.
     * 
     */
    public void setClientUpdatesAllowLaterClientsToUpgrade(boolean value) {
        this.clientUpdatesAllowLaterClientsToUpgrade = value;
    }

    /**
     * Gets the value of the clientUpdatesUpgradeType property.
     * 
     * @return
     *     possible object is
     *     {@link TClientUpgradeType }
     *     
     */
    public TClientUpgradeType getClientUpdatesUpgradeType() {
        return clientUpdatesUpgradeType;
    }

    /**
     * Sets the value of the clientUpdatesUpgradeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TClientUpgradeType }
     *     
     */
    public void setClientUpdatesUpgradeType(TClientUpgradeType value) {
        this.clientUpdatesUpgradeType = value;
    }

    /**
     * Gets the value of the userRestrictionsMinAdminLevelCreateAN property.
     * 
     * @return
     *     possible object is
     *     {@link TUserType }
     *     
     */
    public TUserType getUserRestrictionsMinAdminLevelCreateAN() {
        return userRestrictionsMinAdminLevelCreateAN;
    }

    /**
     * Sets the value of the userRestrictionsMinAdminLevelCreateAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link TUserType }
     *     
     */
    public void setUserRestrictionsMinAdminLevelCreateAN(TUserType value) {
        this.userRestrictionsMinAdminLevelCreateAN = value;
    }

    /**
     * Gets the value of the discoveryBotsQueueCheckFrequency property.
     * 
     */
    public int getDiscoveryBotsQueueCheckFrequency() {
        return discoveryBotsQueueCheckFrequency;
    }

    /**
     * Sets the value of the discoveryBotsQueueCheckFrequency property.
     * 
     */
    public void setDiscoveryBotsQueueCheckFrequency(int value) {
        this.discoveryBotsQueueCheckFrequency = value;
    }

    /**
     * Gets the value of the soapServerEnabled property.
     * 
     */
    public boolean isSOAPServerEnabled() {
        return soapServerEnabled;
    }

    /**
     * Sets the value of the soapServerEnabled property.
     * 
     */
    public void setSOAPServerEnabled(boolean value) {
        this.soapServerEnabled = value;
    }

    /**
     * Gets the value of the soapServerPort property.
     * 
     */
    public int getSOAPServerPort() {
        return soapServerPort;
    }

    /**
     * Sets the value of the soapServerPort property.
     * 
     */
    public void setSOAPServerPort(int value) {
        this.soapServerPort = value;
    }

    /**
     * Gets the value of the soapServerSSLPort property.
     * 
     */
    public int getSOAPServerSSLPort() {
        return soapServerSSLPort;
    }

    /**
     * Sets the value of the soapServerSSLPort property.
     * 
     */
    public void setSOAPServerSSLPort(int value) {
        this.soapServerSSLPort = value;
    }

    /**
     * Gets the value of the soapServerWriteMultiRefArray property.
     * 
     */
    public boolean isSOAPServerWriteMultiRefArray() {
        return soapServerWriteMultiRefArray;
    }

    /**
     * Sets the value of the soapServerWriteMultiRefArray property.
     * 
     */
    public void setSOAPServerWriteMultiRefArray(boolean value) {
        this.soapServerWriteMultiRefArray = value;
    }

    /**
     * Gets the value of the soapServerWriteMultiRefObject property.
     * 
     */
    public boolean isSOAPServerWriteMultiRefObject() {
        return soapServerWriteMultiRefObject;
    }

    /**
     * Sets the value of the soapServerWriteMultiRefObject property.
     * 
     */
    public void setSOAPServerWriteMultiRefObject(boolean value) {
        this.soapServerWriteMultiRefObject = value;
    }

    /**
     * Gets the value of the soapServerSendUntyped property.
     * 
     */
    public boolean isSOAPServerSendUntyped() {
        return soapServerSendUntyped;
    }

    /**
     * Sets the value of the soapServerSendUntyped property.
     * 
     */
    public void setSOAPServerSendUntyped(boolean value) {
        this.soapServerSendUntyped = value;
    }

    /**
     * Gets the value of the soapServerStrictStructureFieldOrder property.
     * 
     */
    public boolean isSOAPServerStrictStructureFieldOrder() {
        return soapServerStrictStructureFieldOrder;
    }

    /**
     * Sets the value of the soapServerStrictStructureFieldOrder property.
     * 
     */
    public void setSOAPServerStrictStructureFieldOrder(boolean value) {
        this.soapServerStrictStructureFieldOrder = value;
    }

    /**
     * Gets the value of the soapServerEncodedXML property.
     * 
     */
    public boolean isSOAPServerEncodedXML() {
        return soapServerEncodedXML;
    }

    /**
     * Sets the value of the soapServerEncodedXML property.
     * 
     */
    public void setSOAPServerEncodedXML(boolean value) {
        this.soapServerEncodedXML = value;
    }

    /**
     * Gets the value of the soapServerClientIDInWSDL property.
     * 
     */
    public boolean isSOAPServerClientIDInWSDL() {
        return soapServerClientIDInWSDL;
    }

    /**
     * Sets the value of the soapServerClientIDInWSDL property.
     * 
     */
    public void setSOAPServerClientIDInWSDL(boolean value) {
        this.soapServerClientIDInWSDL = value;
    }

    /**
     * Gets the value of the soapServerDocument property.
     * 
     */
    public boolean isSOAPServerDocument() {
        return soapServerDocument;
    }

    /**
     * Sets the value of the soapServerDocument property.
     * 
     */
    public void setSOAPServerDocument(boolean value) {
        this.soapServerDocument = value;
    }

    /**
     * Gets the value of the soapServerExternalTypesAsReferences property.
     * 
     */
    public boolean isSOAPServerExternalTypesAsReferences() {
        return soapServerExternalTypesAsReferences;
    }

    /**
     * Sets the value of the soapServerExternalTypesAsReferences property.
     * 
     */
    public void setSOAPServerExternalTypesAsReferences(boolean value) {
        this.soapServerExternalTypesAsReferences = value;
    }

    /**
     * Gets the value of the soapServerSOAP12 property.
     * 
     */
    public boolean isSOAPServerSOAP12() {
        return soapServerSOAP12;
    }

    /**
     * Sets the value of the soapServerSOAP12 property.
     * 
     */
    public void setSOAPServerSOAP12(boolean value) {
        this.soapServerSOAP12 = value;
    }

    /**
     * Gets the value of the soapServerSOAPMode property.
     * 
     * @return
     *     possible object is
     *     {@link TSOAPMode }
     *     
     */
    public TSOAPMode getSOAPServerSOAPMode() {
        return soapServerSOAPMode;
    }

    /**
     * Sets the value of the soapServerSOAPMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link TSOAPMode }
     *     
     */
    public void setSOAPServerSOAPMode(TSOAPMode value) {
        this.soapServerSOAPMode = value;
    }

}
