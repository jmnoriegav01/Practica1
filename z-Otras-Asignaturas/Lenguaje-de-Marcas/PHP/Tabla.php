<?php
    $array = array();

    $array[0] = [ 
                    'Año'=> 1970,
                    'Poblacion'=> 3692492000
                ];
    
    $array[1] = [ 
                    'Año'=> 1975,
                    'Poblacion'=> 4068109000
                ];


    $array[2] = [ 
                    'Año'=> 1980,
                    'Poblacion'=> 4434682000
                ];
    
    $array[3] = [ 
                    'Año'=> 1985,
                    'Poblacion'=> 48309719908000
                ];

    $array[4] = [ 
                    'Año'=> 1990,
                    'Poblacion'=> 5263593000
                ];

    $array[5] = [ 
                    'Año'=> 1995,
                    'Poblacion'=> 5674328000
                ];

    $array[6] = [ 
                    'Año'=> 2000,
                    'Poblacion'=> 6070581000
                ];

    $array[7] = [ 
                    'Año'=> 2005,
                    'Poblacion'=> 6453628000
                ];

    $array[8] = [ 
                    'Año'=> 2008,
                    'Poblacion'=> 6709132760
                ];

    $array[9] = [ 
                    'Año'=> 2010,
                    'Poblacion'=> 6854196000
    ];

    $array[10] = [ 
                    'Año'=> 2011,
                    'Poblacion'=> 7000000000
    ];

    
    $html = <<<HTML
                <table>
                    <tr>
                       <th>Año</th>
                       <th>Poblacion</th> 
                    </tr>
            HTML;

    
    for($i=0;$i<$array.length();$i++){
        "$html.= "<tr>";
        $html.= "<td>" . $array[$i]['Año'] . "</td>";
        $html.= "<td>" . $array[$i]['Poblacion'] . "</td>";
        $html.= "</tr>";
    }

    $html = "</table>";

    echo "<center>Evolucion poblacion mundial</center>";
    echo "<center>" </center>$html;
?>  
