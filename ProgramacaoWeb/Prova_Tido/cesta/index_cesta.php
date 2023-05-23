<?php
include_once "../sidebar.php";
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cesta</title>
  <!-- bootstrap -->
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe" crossorigin="anonymous"></script>
  <style>
    body{
      background-color: #fff;
    }
    .content {
                margin-left: 200px;
                padding: 20px;
            }
    #main-text{
      text-align: center;
    }
    #text-body{
      text-align: center;
    }
    #curve_chart{
      margin-left: 245px;
    }
  </style>
</head>
<body>
  <div class="content" id="main-text">
      <h1>Insira os dados pesquisados</h1>
  </div>
  <div class="register">
  <form action="insert_cesta.php" method="post">
    <div class="content mb-3">
      <label for="valoryago" class="form-label">Digite o valor</label>
      <input type="text" name="valoryago" id="valoryago" class="form-control">
    </div>
    <div class="content mb-3">
      <label for="anoyago" class="form-label">Digite o ano</label>
      <input type="text" name="anoyago" id="anoyago" class="form-control">
    </div>
    <div class="content">
      <button>Inserir</button>
    </div>
  </form>
  </div>
  <br>
  <div class="content" id="text-body"><h1>Lista dos dados</h1></div>
  <?php
  include "list_cesta.php";
  ?>
  <!-- Google Charts-->
  <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);

      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Ano', 'Valor'],
          
          <?php
          
          require_once "../conn.php";
          
          
          $stmt = $conn -> prepare("SELECT * FROM cestayago");
          $stmt -> execute();
          $list = $stmt -> fetchAll(PDO::FETCH_ASSOC);

          foreach ($list as $item) :

          ?> 

            ['<?= $item['anoyago'];?>', <?= $item['valoryago']; ?>],
          
          <?php endforeach; ?>
        ]);

        var options = {
          title: 'Salário/Cesta',
          curveType: 'function',
          legend: { position: 'bottom' }
        };

        var chart = new google.visualization.LineChart(document.getElementById('curve_chart'));

        chart.draw(data, options);
      }
    </script>
    <div class="content figure" id="curve_chart" style="width: 900px; height: 500px"></div>
</body>
</html>