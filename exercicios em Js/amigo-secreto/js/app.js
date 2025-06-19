let amigos = [];

function adicionar(){

    let amigo = document.getElementById('nome-amigo');
    let lista = document.getElementById('lista-amigos');
    amigos.push(amigo.value)
    
    if (amigo.value != ''){
        if(lista.textContent == ''){
            lista.textContent = amigo.value;
        }else{
          
            if(amigos.includes(amigo.value)){
                alert('nome ja adicionado');
                return;
    }
            lista.textContent = lista.textContent + ', ' + amigo.value;
        }
    }else{
        alert("Deve ser digitado o nome do amigo")
    }
    amigo.value = '';

 


}

function sortear(){
    if(amigos.length <= 3){

    alert("deve ter pelo menos 4 pessoas")
    return
   }
    embaralha(amigos);
    let listasorteio = document.getElementById('lista-sorteio');
    for (let i = 0; i < amigos.length; i++) {
        if(i == amigos.length -1){
            listasorteio.innerHTML = listasorteio.innerHTML + amigos[i] + ' --> ' + amigos[0] + '<br>'
        }else{
            listasorteio.innerHTML = listasorteio.innerHTML + amigos[i] + ' --> ' + amigos[i + 1] + '<br>'
        }
    }


}

function embaralha(lista) {

    for (let indice = lista.length; indice; indice--) {

        const indiceAleatorio = Math.floor(Math.random() * indice);

        // atribuição via destructuring
        [lista[indice - 1], lista[indiceAleatorio]] = 
            [lista[indiceAleatorio], lista[indice - 1]];
    }
}

function reiniciar(){
    amigos = [];
    document.getElementById('lista-amigos').innerHTML = '';
    document.getElementById('lista-sorteio').innerHTML = '';
}