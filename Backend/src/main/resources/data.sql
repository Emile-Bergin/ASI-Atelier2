INSERT INTO customer (name, surname, password, token, wallet)
VALUES ('Aymrick Cougoulat', 'Railgun', 'root', 'testtoken', 300),
       ('Emile Bergin', '3mile', 'root', 'testtoken', 300),
       ('Clement Dethoor', '2Dethor', 'root', 'testtoken', 300),
       ('Hugo Benucci', 'Hug0', 'root', 'testtoken', 300),
       ('Gregoire Chateauneuf', 'Gr3g', 'root', 'testtoken', 300);

INSERT INTO card_family (name, code, color)
VALUES ('Normal', 'NOR', 'text-gray-500'),
       ('Mega-Pokemon', 'MEGA', 'text-blue-800'),
       ('Primo-resurgence', 'PRI', 'text-gray-500'),
       ('Gigamax', 'GIGA', 'text-red-800');

INSERT INTO card_type (name, code, color)
VALUES ('Normal', 'NOR', 'bg-red-800'),
       ('Acier', 'ACI', 'bg-gray-300'),
       ('Combat', 'COM', 'bg-red-700'),
       ('Dragon', 'DRAG', 'bg-yellow-600'),
       ('Eau', 'EAU', 'bg-blue-600'),
       ('Electrik', 'ELEK', 'bg-yellow-400'),
       ('Fee', 'FEE', 'bg-red-300'),
       ('Feu', 'FEU', 'bg-red-600'),
       ('Glace', 'GLA', 'bg-blue-300'),
       ('Insecte', 'INS', 'bg-green-600'),
       ('Plante', 'PLA', 'bg-green-400'),
       ('Poison', 'POI', 'bg-purple-400'),
       ('Psy', 'PSY', 'bg-pink-500'),
       ('Roche', 'ROC', 'bg-yellow-900'),
       ('Sol', 'SOL', 'bg-yellow-700'),
       ('Spectre', 'SPEC', 'bg-purple-900'),
       ('Tenebre', 'TEN', 'bg-indigo-800'),
       ('Vol', 'VOL', 'bg-purple-300'),
       ('Obscur', 'OBS', 'bg-gray-900'),
       ('Inconnu', 'INCO', 'bg-gray-500');

INSERT INTO card (title, description, health_point, price, id_family, id_type, id_user)
VALUES ('Bulbizarre', 'Il a une etrange graine plantee sur son dos. Elle grandit avec lui depuis la naissance.', 60, 50,
        1, 11, null),
       ('Carapuce', 'Son dos durcit avec l''age et devient une super carapace. Il peut cracher des jets d''ecume.', 40,
        25, 1, 5, null),
       ('Salameche', 'Il prefere les endroits chauds. En cas de pluie, de la vapeur se forme autour de sa queue.', 50,
        100, 1, 8, null),
       ('Pikachu', 'Quand plusieurs de ces POKEMON se reunissent, ils provoquent de gigantesques orages.', 60, 15, 1, 6,
        null),
       ('Evoli', 'Il a la capacite de changer la composition de son corps pour s''adapter à son environnement.', 30,
        100, 1, 1, null),
       ('Lucario', 'Il peut deviner les pensees et les mouvements des autres en analysant leur aura.', 130, 200, 1, 3,
        null),
        ('Mega-Lucario', 'L''energie de la Mega-Évolution s''est melangee à son aura. Ensemble, elles ont coule sur son corps et y ont laisse des traces noires.', 130, 200, 2, 3,
        null),
        ('Dracaufeau Gigamax', 'Grace au phenomene Gigamax, il a pris la forme d''un Dracaufeu geant dote d''ailes de feu.', 130, 200, 4, 8,
        null);
