<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
 <html>
 <head>
        <title>Regulatory Document : Annotated</title>
        <link rel="stylesheet" type="text/css" href="reg_css.css"/>
  </head>
  <body>
        <!-- meta information -->
        <xsl:for-each select="document/meta">
        <div class="head">
                <div class="name"><xsl:value-of select="name"/></div>
                <div class="description">   <xsl:value-of select="description"/></div>
                <div class="details">
                        Version :  <xsl:value-of select="version"/>
                        Published on : <xsl:value-of select="published_on"/>
                        Body : <xsl:value-of select="body"/>
                </div>
        </div>
        </xsl:for-each>

    <!-- content information -->
    <xsl:for-each select="document/body/*">
        <div class="level_1">                 <xsl:value-of select="text"/>         </div>
        <xsl:for-each select="./*">
			<div class="level_2">                 <xsl:value-of select="text"/>         </div>
			<xsl:for-each select="./*">
				<div class="level_3">                 <xsl:value-of select="text"/>         </div>
				<xsl:for-each select="./*">
					<div class="level_4">                 <xsl:value-of select="text"/>         </div>
					<xsl:for-each select="./*">
						<div class="level_5">                 <xsl:value-of select="text"/>         </div>
						<xsl:for-each select="./*">
							<div class="level_6">                 <xsl:value-of select="text"/>         </div>
							<xsl:for-each select="./*">
						   </xsl:for-each>
					   </xsl:for-each>
				   </xsl:for-each>
			   </xsl:for-each>
		   </xsl:for-each>
       </xsl:for-each>
    </xsl:for-each>
  </body>
  </html>
</xsl:template>
</xsl:stylesheet>