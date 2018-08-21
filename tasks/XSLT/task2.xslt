<?xml version="1.0" ?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:output method="html" 
        doctype-system="about:legacy-compat"
        encoding="UTF-8"
        indent="yes"
        media-type="text/html"/>
<xsl:template match="/">
<html>
<table border="1">
<tr>
<td rowspan="2" align="center"><strong>Name</strong></td>
<td rowspan="2" align="center"><strong>City</strong></td>
<td rowspan="2" align="center"><strong>Street</strong></td>
<td colspan="3" align="center"><strong>Phone</strong></td>
<td colspan="3" align="center"><strong>Documents</strong></td>
</tr>
<tr>
<td align="center"><strong>Home</strong></td>
<td align="center"><strong>Mobile</strong></td>
<td align="center"><strong>Work</strong></td>
<td align="center"><strong>Passport</strong></td>
<td align="center"><strong>Driving permit</strong></td>
</tr>
<xsl:for-each select="addresses/address">
<tr>
<td><xsl:value-of select="name"/></td>
<td>
<xsl:if test="not(city)">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="city"/></td>
<td>
<xsl:if test="not(street)">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="street"/></td>
<td>
<xsl:if test="not(phone[@type='home'])">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="phone[@type='home']"/></td>
<td>
<xsl:if test="not(phone[@type='mobile'])">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="phone[@type='mobile']"/></td>
<td>
<xsl:if test="not(phone[@type='work'])">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="phone[@type='work']"/></td>
<td>
<xsl:if test="not(documents/document[@type='passport'])">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="documents/document[@type='passport']"/></td>
<td>
<xsl:if test="not(documents/document[@type='driving permit'])">
<xsl:attribute name="style">border-style: none</xsl:attribute>
</xsl:if>
<xsl:value-of select="documents/document[@type='driving permit']"/></td>
</tr>
</xsl:for-each>
</table>
</html>
</xsl:template>
</xsl:stylesheet>