CREATE TABLE IF NOT EXISTS super_hero (
    id BIGINT,
    name VARCHAR(40) NOT NULL,
    normie_name VARCHAR(40),
    PRIMARY KEY (id)
);

INSERT INTO super_hero(
    id,
    name,
    normie_name
    )
VALUES
    (1, 'Iron Man', 'Tony Stark'),
    (2, 'Batman', 'Bruce Wayne'),
    (3, 'Starlord', 'Peter Quill');
