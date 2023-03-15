import { useEffect, useState } from "react";

export const CicloVida = () => {
    const [open, setOpen] = useState(false);
    const [sapato, setSapato] = useState(false);

    useEffect(() => {
        console.log("Sem array de dependencias");

        return () => console.log("Execução na desmontagem - Sem array de dependências")
    });

    useEffect(() => {
        console.log("Array de dependencias vazio");

        return () => console.log("Execução na desmontagem - Array de dependências vazio")

    }, []);

    useEffect(() => {
        console.log("Array de dependencias vazio", open, sapato);

        return () => console.log("Execução na desmontagem - Array de dependências")

    }, [open]);

    const handleOpem = () => {
        setOpen((prev) => !prev);
    }

    // const handleSapato = (event) => {
    //     console.log()
    // }

    return (
        <>
            <h1>Ciclo Vida</h1>
            <button onClick={handleOpem}>{open ? "Fechar" : "Abrir"}</button>
        </>
    )
}