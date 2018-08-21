<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output version="1.0" method="xml" omit-xml-declaration="no" />
<xsl:template match="/">
<names>
<xsl:for-each select="addresses/address">
<name><xsl:value-of select="name"/></name>
</xsl:for-each>
</names>
</xsl:template>
</xsl:stylesheet>