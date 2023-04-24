let tagBody = document.querySelector("body");

let tagUl = document.createElement("ul");
let tagLi1 =   document.createElement("li");
let tagLi2 =   document.createElement("li");
let tagLi3 =   document.createElement("li");
let tagLi4 =   document.createElement("li");

tagLi1.classList.add("filme1");
tagLi2.classList.add("filme2");
tagLi3.classList.add("filme3");
tagLi4.classList.add("filme4");

tagLi1.innerHTML = "Exorcista";
tagLi2.innerHTML = "Sexta feira 13"
tagLi3.innerHTML = "Madrugada dos mortos";
tagLi4.innerHTML = "Cemiterio Maldito";

tagBody.appendChild(tagUl);
tagUl.appendChild(tagLi1);
tagUl.appendChild(tagLi2);
tagUl.appendChild(tagLi3);
tagUl.appendChild(tagLi4);

