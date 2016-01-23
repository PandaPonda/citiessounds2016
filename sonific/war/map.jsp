<%@page import="com.basis.City"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    
    List<City> cities = (List<City>) request.getAttribute("cities");
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset=utf-8 />
<title>Сонификация городов</title>
<meta name='viewport' content='initial-scale=1,maximum-scale=1,user-scalable=no' />
<script src='https://api.mapbox.com/mapbox.js/v2.2.3/mapbox.js'></script>
<link href='https://api.mapbox.com/mapbox.js/v2.2.3/mapbox.css' rel='stylesheet' />
<style>
  body { margin:0; padding:0; }
  #map { position:absolute; top:0;left:0; bottom:0; width:100%; }
  #test { position:absolute; top:10%; right:10%; bottom:10%; width:10%;display : none; }
  #freim {display : none;}
</style>


<script type="text/javascript">

    function toggle_visibility(id,flag) {
       var e = document.getElementById(id);
       //var s = document.getElementById(cityid);
       if(flag == 0)
    	   {
      		 if(e.style.display == 'block')
           			e.style.display = 'none';
        	else
           			e.style.display = 'block';
    	   }
       else
          e.style.display = 'block';
    }
</script>
<script type="text/javascript">

    function divContent(id,cityid) {
       var e = document.getElementById(id);
       <% for(City city : cities) { %>
       var temp = '<%=city.getName()%>';
       if (cityid==temp)
    	   {
    	e.innerHTML = "вывод любых значений из базы данных";
		e.innerHTML += "<br>"+cityid+"<br>";
		e.innerHTML += "<br>"+"продуктовая корзина "+"<%=city.getFoodBasket() %>"+"<br>"+"площадь города... "+"<%=city.getArea() %>"+"<br>"+"ещё параметры "+"<%=city.getApartmentsCost() %>"+"<br>";
    	   }
       <%}%> 
    }
</script>

<script type="text/javascript">
var allcities = {
		texas : "fr",
<% for(City city : cities) { %>
<%=city.getName() %> : {
korzina : "<%=city.getFoodBasket() %>",
koord1 : "<%=city.getKoord1() %>",
koord2 : "<%=city.getKoord2() %>",
soundcloud : "<%=city.getSoundcloud() %>",
apartmentsCost : "<%=city.getApartmentsCost() %>"

},
<% 
}
%>
}
//alert('+');
</script>



</head>

<body>
<div id='map'>map</div>
<div id='test'> жители<br> корзина<br> и тд<br> и тп<br> <h1 id='test2'></h1>
</div>
<script>

</script>
<script>

L.mapbox.accessToken = 'pk.eyJ1Ijoia2FpbXBlciIsImEiOiJjaWd4bXQ0a2cwMGNkdjBrcml2MTQxcDhqIn0.FJU2LtZv-8wyT3EH4YUd4A';
var map = L.mapbox.map('map', 'kaimper.91d35711')
    .setView([62, 97], 3);
var myLayer = L.mapbox.featureLayer().addTo(map);



var geojson = {   
		
    type: 'Feature',
    features: [
    	<% for(City city : cities) { %>
    	{
        type: 'Feature',
        properties: {
            title: '<%=city.getName() %>',
            url: '<%=city.getName() %>',
            flag: '0',
             'marker-color': '#3ca20f',
            'marker-size': 'large',
            video: '<iframe width="300" height="200" scrolling="no" frameborder="no" src="https://w.soundcloud.com/player/?url=https%3A//api.soundcloud.com/tracks/<%=city.getSoundcloud() %>&amp;auto_play=false&amp;hide_related=false&amp;show_comments=false&amp;show_user=false&amp;show_reposts=false&amp;visual=false"></iframe>',
            
            
        },
        geometry: {
            type: 'Point',
            coordinates: [<%=city.getKoord1() %>, <%=city.getKoord2() %>]
        }
    },
      
    <% }%>
    ]
};

var myLayer = L.mapbox.featureLayer().addTo(map);

//Add the iframe in a marker tooltip using the custom feature properties
myLayer.on('layeradd', function(e) {
 var marker = e.layer,
     feature = marker.feature;

 // Create custom popup content from the GeoJSON property 'video'
 var popupContent =  feature.properties.video;

 // bind the popup to the marker http://leafletjs.com/reference.html#popup
 marker.bindPopup(popupContent,{
     closeButton: false,
     minWidth: 320
 });
});
//cityid = 0;
//Add features to the map
myLayer.setGeoJSON(geojson);
</script>
<script>
myLayer.on('click', function(e) { 
	//alert(allcities.cityid.get().korzina); 
			
			
	if (allcities.texas == 'fr')
		{
		allcities.texas = e.layer.feature.properties.url;
		var cityid = e.layer.feature.properties.url;
		toggle_visibility('test',1);
		divContent('test',cityid);
		}
	else if (allcities.texas == e.layer.feature.properties.url)
		{
    	toggle_visibility('test',0);
		var cityid = e.layer.feature.properties.url;
		//divContent('test',cityid);
		}
	else
		{
		toggle_visibility('test',1);
		allcities.texas = e.layer.feature.properties.url;
		var cityid = e.layer.feature.properties.url;
		divContent('test',cityid);
		}
});           

</script>
</body>
</html>
