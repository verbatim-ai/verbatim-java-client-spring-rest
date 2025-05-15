

# TokenInfo


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**issuer** | **String** | Issuer of the token |  [optional] |
|**issuedAt** | **OffsetDateTime** | When this token has been produced |  [optional] |
|**expiresAt** | **OffsetDateTime** | Expiration date of this token |  [optional] |
|**organizationId** | **String** | ID of the organization who owned the authenticate user |  [optional] |
|**userId** | **String** | UID of the user, authenticated when the current token |  [optional] |
|**keyId** | **String** | ID of the key used to sign he token. Only for Verbatim issuer |  [optional] |
|**email** | **String** | Email of the authenticate user |  [optional] |
|**name** | **String** | Name of the authenticate user |  [optional] |
|**emailVerified** | **Boolean** | True when email is verified |  [optional] |



