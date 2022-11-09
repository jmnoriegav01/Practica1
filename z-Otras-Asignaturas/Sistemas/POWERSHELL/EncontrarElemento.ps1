$array = @("pepe","jose","antonio")
$nombre = Read-Host "Introduce un nombre"
$encontrado = 0

foreach($celda in $array) {
    if($celda -eq $nombre){
            $encontrado = 1 
            break
 
    }
    else{
            $encontrado = 0
    }
}

Write-Host $encontrado
if($encontrado -eq 1){
        Write-Host "Encontrado" 
}
else{
        Write-Host "No Encontrado"
}