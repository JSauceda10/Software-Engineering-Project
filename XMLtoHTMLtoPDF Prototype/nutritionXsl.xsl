<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:output method="xml" indent="yes"/>
<xsl:template match="/">

<html>
	<head>
		<title>Vaqueros Nutrition System</title>
		<link rel="stylesheet" href="web-gallery/fonts.css" type="text/css" />
		<link rel="stylesheet" href="web-gallery/style.css" type="text/css" />
	</head>
	<body>
	<div class="header">
		<div class="logo"><img src="web-gallery/images/logo.png"/></div>
		<div class="title"><div class="orange">Vaq</div>Nutri</div>
	</div>
	<div class="sub-header">
			<div class="sub-title">Nutrition Facts</div>
			<div class="sub-info">Other</div>
		</div>
		<table>
			<thead>
				<th>Name</th>
				<th>Serving Size</th>
				<th>Calories</th>
				<th>Total Fats</th>
				<th>Cholesterol</th>
				<th>Sodium</th>
				<th>Potassium</th>
				<th>Carbohydrates</th>
				<th>Proteins</th>
			</thead>
			<xsl:for-each select="NutritionFacts/NutrientComponent">
			<tr>
				<td width="200"><xsl:value-of select="name"/></td>
				<td class="center" width="100"><xsl:value-of select="serving"/> g</td>
				<td class="center" width="100"><xsl:value-of select="calories"/></td>
				<td class="center" width="100"><xsl:value-of select="fats"/> g</td>
				<td class="center" width="100"><xsl:value-of select="cholesterol"/> mg</td>
				<td class="center" width="100"><xsl:value-of select="sodium"/> mg</td>
				<td class="center" width="100"><xsl:value-of select="potassium"/></td>
				<td class="center" width="100"><xsl:value-of select="carbohydrates"/> g</td>
				<td class="center" width="100"><xsl:value-of select="proteins"/> g</td>
			</tr>
			</xsl:for-each>
		</table>
	</body>
</html>

</xsl:template>
</xsl:stylesheet>