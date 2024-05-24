#!/bin/bash
# Считываем входную и выходную директорию
read input_dir
read output_dir
# Предоставляет полный доступ ко всем файлам и директориям
chmod 777 $input
# Ищем все файлы во входной директории и проходим по ним
find $input_dir -type f -name "*.*" | while read file; do 
  filename=$(basename "$file")
  # Формируем путь для копирования файла
  destination="$output_dir/$filename"

  # Проверяем, существует ли файл с таким же именем в выходном каталоге
  if [[ -f "$destination" ]]; then
    counter=1
    while [[ -f "$destination" ]]; do
      new_filename="${filename%.*}_$counter.${filename##*.}"
      destination="$output_dir/$new_filename"
      ((counter++))
    done
  fi

  # Копируем файл в выходную директорию
  cp "$file" "$destination"
done
