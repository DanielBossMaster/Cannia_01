<!DOCTYPE html>
<html lang="es">
<head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
  <title>Historial Clínico</title>
  <style>
    body {
      margin: 0;
      font-family: Verdana, Geneva, Tahoma, sans-serif;
      background-color: #f7eafc;
    }

    header {
      background: linear-gradient(to right, #d600b9, #2c0045);
      padding: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
      display: flex;
      justify-content: space-between;
    }

    header img {
      width: 80px;
      height: auto;
    }

    .links a {
      text-decoration: none;
      color: #e6d8d8;
      font-weight: bold;
    }

    nav {
      display: flex;
      margin-top: 5px;
      gap: 30px;
    }

    .search-bar {
      text-align: center;
      margin: 30px auto 10px;
    }

    .search-bar input[type="search"] {
      width: 50%;
      padding: 10px;
      border-radius: 10px;
      border: 2px solid #6a1b9a;
      font-size: 16px;
    }

    .clientes {
      display: flex;
      flex-wrap: wrap;
      justify-content: center;
      gap: 20px;
      padding: 20px;
    }

    .cliente {
      background: rgb(248, 244, 250);
      box-shadow: 2px 2px 10px rgba(150, 146, 149, 0.856);
      padding: 20px;
      border-radius: 15px;
      width: 300px;
      
    }

    .cliente h3 {
      margin-top: 0;
    }

    .cliente button {
      margin-top: 10px;
      background-color: #6e338b;
      color: white;
      border: none;
      padding: 8px;
      width: 100%;
      border-radius: 8px;
      cursor: pointer;
      font-weight: bold;
    }

    .cliente button:hover {
      background-color: #4e116d;
    }
  </style>
</head>
<body>
  <header>
    <div class="logo">
      <img src="<?= base_url('/img/logo.png') ?>" alt="logo">
    </div>
    <nav class="links">
      <a href="<?= base_url('veterinario') ?>">Inicio</a>
      <a href="<?= base_url('veterinario/busqueda') ?>">Mascotas</a>
      <a href="<?= base_url('cerrar-sesion') ?>">Cerrar sesión</a>
    </nav>
  </header>

  <div class="search-bar">
    <form method="get" action="<?= base_url('veterinario/busqueda') ?>">
      <input type="search" name="q" placeholder="Buscar por nombre, especie, color, documento, etc..." value="<?= esc($q ?? '') ?>">
    </form>
  </div>
<div class="container">
  <div class="fila">
  <main class="clientes">
    <?php if (!empty($resultados)): ?>
      <?php foreach ($resultados as $item): ?>
        <div class="cliente">
          <h3><?= esc($item->nombre_pro) ?> <?= esc($item->apellido_pro) ?></h3>
          <p><strong>Documento:</strong> <?= esc($item->num_doc) ?></p>
          <p><strong>Teléfono:</strong> <?= esc($item->telefono_pro) ?></p>
          <p><strong>Correo:</strong> <?= esc($item->correo_pro) ?></p>

          <hr>

          <h4>Mascota: <?= esc($item->nom_mascota) ?></h4>
          <p><strong>Especie:</strong> <?= esc($item->especie) ?></p>
          <p><strong>Color:</strong> <?= esc($item->color) ?></p>
          <p><strong>Vacuna:</strong> <?= esc($item->nom_vacuna) ?></p>
          <p><strong>Fecha de Vacuna:</strong> <?= esc($item->fecha_vacunacion) ?></p>
          <p><strong>Medicamento:</strong> <?= esc($item->medicamento) ?></p>

          <form method="get" action="<?= base_url('veterinario/editar/' . $item->num_doc) ?>">
            <button type="submit"> Editar Propietario</button>
          </form>
          <form method="get" action="<?= base_url('propietario/eliminar/' . $item->num_doc) ?>">
            <button type="submit"> Eliminar Propietario</button>
          </form>

          <form method="get" action="<?= base_url('mascota/editar_mascota/' . $item->id_mascota) ?>">
            <button type="submit"> Editar Mascota</button>
          </form>

          <form method="get" action="<?= base_url('historiaClinica/' . $item->id_mascota) ?>">
            <button type="submit"> Historia Clínica</button>
          </form>
        </div>
      <?php endforeach; ?>
    <?php else: ?>
      <p style="text-align:center; font-size: 18px; color: #6a1b9a;">No se encontraron resultados.</p>
    <?php endif; ?>
  </main>
 </div>  
</div>
</body>
</html>