<!DOCTYPE html>
<html lang="es">

<head>
    <meta charset="UTF-8">
    <title>Dashboard Propietario</title>
    <style>
        body {
            margin: 0;
            font-family: 'Segoe UI', sans-serif;
            background-color: #f0e6ee;
            color: white;
            text-align: center;
        }
        
        header {
 background: linear-gradient(to right,#d600b9, #2c0045);
 padding: 5px;
 box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1); 
 display: flex;
 justify-content: space-between;
}

header img {
 width: 80px;
 height: auto;
 justify-content: left;

}

nav {
 display: flex;
 margin-top: 5px;
 gap: 30px;
}
.links a {
 text-decoration: none;
 color: #e6d8d8;
 font-weight: bold;

}
        
        .container {
            max-width: 700px;
            margin: auto;
            background: white;
            color: #4A148C;
            padding: 30px;
            border-radius: 16px;
            margin-top: 30px;
            margin-bottom: 40px;
            text-align: left;
        }
        
        h2 {
            text-align: center;
            color: #6A1B9A;
        }
        
        .button {
            width: 100%;
            padding: 15px;
            margin: 10px 0;
            background-color: #6A1B9A;
            color: white;
            border: none;
            border-radius: 10px;
            font-size: 16px;
            cursor: pointer;
            font-weight: bold;
        }
        
        .button:hover {
            background-color: #4A148C;
        }
        
        .seccion {
            display: none;
            margin-top: 20px;
        }
        
        .info-box,
        .mascota,
        .historia {
            background-color: #f3e5f5;
            padding: 15px;
            margin-bottom: 10px;
            border-radius: 10px;
        }
        
        .btn-secundario {
            background-color: #6A1B9A;
            color: white;
            border: none;
            padding: 10px 15px;
            border-radius: 8px;
            cursor: pointer;
            margin-top: 10px;
        }
        
        .formulario input {
            display: block;
            width: 100%;
            padding: 8px;
            margin-top: 8px;
            margin-bottom: 12px;
            border-radius: 6px;
            border: 1px solid #ccc;
        }
        
        .formulario button  {
            background-color: #6A1B9A;
            color: white;
            border: none;
            padding: 10px;
            border-radius: 8px;
            cursor: pointer;
            width: 100%;
        }
        
        .button a{
           text-decoration: none;
           color: #e6d8d8;
           font-weight: bold;

        }    
        
        .historia {
            font-size: 14px;
            color: #000;
        }
        
        footer {
            margin: 40px 0;
            font-size: 12px;
            color: #ccc;
            text-align: center;
        }
    </style>

    
</head>

<body>

   <header>
     <div class="logo">
           <img src="<?=base_url("/img/logo.png")?>" alt="logo">

    </div>
    <nav class="links">  
        <a href="error404.html">Comprar</a> 
        <a href="dashboard.html" title="Dashboard">Veterinaria</a> 
        <a href="formulario.html" title="Formulario">Registrar Mascota</a> 
        <a href="<?= base_url('cerrar-sesion') ?>" title="login">Cerrar sesion </a>    
    </nav>
</header>

<!-- Esta es la primera -->
    <div class="container" >
        <h2>Bienvenido  </h2>

        <button class="button" > Datos del Propietario</button>
       
            <div class="info-box" id="datosPropietario">
                
                <p><strong>Documento</strong> <?= esc($propietario['num_doc']); ?></p>
                <p><strong>Nombre:</strong> <?= esc($propietario['nombre_pro']); ?></p>
                <p><strong>Dirección:</strong> <?= esc($propietario['direccion_pro']); ?></p>
                <p><strong>Teléfono:</strong> <?= esc($propietario['telefono_pro']); ?></p>
            </div>
       <button class="button" >  <a href="<?= base_url('/propietario/editar/'.$propietario['num_doc']) ?>">Actuaizar Datos</a></button>
       <button class="button" >  <a href="<?= base_url('/propietario/exportar-mascotas/'.$propietario['num_doc']) ?>">Exportar Mascotas</a></button>



        <button class="button"> Mascotas</button>
        

            <?php if (!empty($mascotas)): ?>
    <?php foreach ($mascotas as $mascota): ?>
        <div class="mascota">
            <h4><?= esc($mascota['nom_mascota']); ?></h4>
            <button class="btn-secundario"> Historia Clínica</button>
            <div class="historia">
                <p><strong>Raza:</strong> <?= esc($mascota['raza']); ?></p>
                <p><strong>Color:</strong> <?= esc($mascota['color']); ?></p>
                <p><strong>Edad:</strong> <?= esc($mascota['fecha_nacimiento']); ?></p>
                <p><strong>Fecha de Vacunación:</strong> <?= esc($mascota['fecha_vacunacion']); ?></p>
                <p><strong>Vacuna Aplicada:</strong> <?= esc($mascota['nom_vacuna']); ?></p>
                <p><strong>Medicamentos:</strong> <?= esc($mascota['medicamento']); ?></p>
                <a href="<?= base_url('/propietario/imprimir/' . $propietario['num_doc']) ?>">
                    <button class="btn-secundario"> Imprimir Historia</button>
                </a>
            <a href="<?= base_url('/propietario/editarMascota/' . $mascota['id_mascota']) ?>">
                <button class="btn-secundario">Editar</button>
            </a>
            <form action="<?= base_url('/propietario/eliminarMascota/' . $mascota['id_mascota']) ?>" method="post" onsubmit="return confirm('¿Estás seguro de eliminar esta mascota?')">
                <button type="submit" class="btn-secundario">Eliminar</button>
            </form>                   
            </div>
        </div>
    <?php endforeach; ?>
<?php else: ?>
    <p style="color:#4A148C; text-align:center;">No tienes mascotas registradas.</p>
<?php endif; ?>


        </div>
    </div>

    <!-- Contenedor no lo veo  para imprimir PDF -->
    <div id="print-area" style="display: none;"></div>

    <footer>
        © 2025 App Cannia. Todos los derechos reservados.
    </footer>

</body>

</html>


