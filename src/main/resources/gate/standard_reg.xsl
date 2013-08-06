<?xml version="1.0" encoding="iso-8859-1"?>
<xsl:stylesheet version="1.0"
xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

<xsl:template match="/">
  <html>
  <head>
  	<title>Regulatory Document : Annotated</title>
  	<link rel="stylesheet" type="text/css" href="standard_reg.css"/>
  </head>
  <body>
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
    <xsl:for-each select="document/section">
	<div class="section">
		<div class="subsubsection">Section:<xsl:value-of select="subsubsection"/> </div>
		<xsl:for-each select="subsection">
			<div class="subsubsubsection">Subsection: <xsl:value-of select="subsubsubsection"/></div>
			<xsl:for-each select="regulation">
				<div class="regulation">Regulation: 
					<xsl:for-each select="statement">
						<div class="statement"> <xsl:value-of select="current()"/> </div>
					</xsl:for-each>
				</div>
			</xsl:for-each>
		</xsl:for-each>
	</div>
    </xsl:for-each>
	
  </body>
  </html>
</xsl:template>

</xsl:stylesheet>