# Generated by Django 4.0.6 on 2023-05-27 03:49

from django.db import migrations, models
import django.utils.timezone


class Migration(migrations.Migration):

    dependencies = [
        ('core', '0002_delete_categoria'),
    ]

    operations = [
        migrations.AddField(
            model_name='solicitudservicio',
            name='horavisita',
            field=models.DateTimeField(default=django.utils.timezone.now),
        ),
    ]
